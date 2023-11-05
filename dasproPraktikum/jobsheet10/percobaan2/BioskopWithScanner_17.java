package percobaan2;
import java.util.Scanner;

public class BioskopWithScanner_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String penonton[][] = new String[4][2];

        while (true) {
            System.out.println("1. Input penonton");
            System.out.println("2. Tampilkan penonton");
            System.out.println("3. Exit");
            int menu = sc.nextInt();

            if (menu == 1) {
                boolean isPenonton = true;

                while (isPenonton) {
                    Scanner inputPenonton = new Scanner(System.in);

                    System.out.print("Masukan nama: ");
                    String nama = inputPenonton.next();

                    System.out.print("Masukan baris: ");
                    int baris = inputPenonton.nextInt();

                    System.out.print("Masukan kolom: ");
                    int kolom = inputPenonton.nextInt();

                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton berhasil ditambahkan.");
                        } else {
                            System.out.println("Kursi sudah terisi. Pilih kursi lain.");
                        }
                    } else {
                        System.out.println("Baris atau kolom tidak valid. Harap masukkan nomor yang benar.");
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = inputPenonton.next();

                    if (next.equalsIgnoreCase("n")) {
                        isPenonton = false;
                    }
                }
            }

            if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("***");
                        }else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                        
                    }
                }
            }

            if (menu == 3) {
                break;
            }
        }
    }
}
