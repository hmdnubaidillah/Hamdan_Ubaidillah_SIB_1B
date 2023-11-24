package tugas;

import java.util.Scanner;

public class NilaiMhs {

    // static int nilaiMhs[][] = {
    // { 20, 19, 25, 20, 10, 0, 10 }, // sari
    // { 30, 30, 40, 10, 15, 20, 25 }, // rani
    // { 5, 0, 20, 25, 10, 5, 45 }, // yani
    // { 50, 0, 7, 8, 0, 30, 60 }, // dwi
    // { 15, 10, 16, 15, 10, 10, 5 } // lusi
    // };

    static int nilaiMhs[][] = new int[5][7];

    static String namaMhs[] = { "Sari", "Rani", "Yani", "Dwi", "Lusi" };

    static void inputScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan nilai mahasiswa");

        for (int i = 0; i < nilaiMhs.length; i++) {
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                nilaiMhs[i][j] = sc.nextInt();
            }
        }

    }

    static void showAllMhsScore() {
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println(namaMhs[i]);

            for (int j = 0; j < nilaiMhs[i].length; j++) {
                System.out.print(nilaiMhs[i][j] + " ");

            }
            System.out.println();
        }

    }

    static void showHighestMhsScore() {

        for (int i = 0; i < nilaiMhs.length; i++) {
            int sum = 0;
            for (int j = 0; j < nilaiMhs[i].length; j++) {

                sum += nilaiMhs[i][j];
            }
            System.out.println(namaMhs[i] + ": " + sum);
        }
    }

    static void showHighestScorePerWeek() {
        for (int i = 0; i < nilaiMhs.length; i++) {
            int foo = nilaiMhs[i][0];
            int counter = 1;

            for (int j = 0; j < nilaiMhs[i].length; j++) {

                if (foo > nilaiMhs[i][j]) {
                    continue;
                } else {
                    foo = nilaiMhs[i][j];
                }
                counter++;
            }
            System.out.println(namaMhs[i] + " minggu ke-" + " " + counter + " nilai " + foo);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean stop = false;

        System.out.println("1.input data");
        System.out.println("2.tampilkan data nilai mhs");
        System.out.println("3.cari nilai tertinggi tiap minggu");
        System.out.println("4.tampilkan nilai mahasiswa yang paling tinggi");

        while (!stop) {
            System.out.println("Masukan menu : ");
            int input = sc.nextInt();

            if (input == 0) {
                stop = false;
                break;
            } else if (input == 1) {
                inputScore();

            } else if (input == 2) {
                showAllMhsScore();
            } else if (input == 3) {
                showHighestScorePerWeek();

            } else if (input == 4) {
                showHighestMhsScore();
            } else {
                System.out.println("Input not valid");
            }
        }
    }
}
