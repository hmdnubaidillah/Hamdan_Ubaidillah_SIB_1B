package percobaan3;

import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah mahasiswa : ");
        int jmlMhs = input.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double total = 0;
        double rata2;
        int mhsLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("masukan nilai mahassiwa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0;i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70){
                mhsLulus++;
            } 
        }
        System.out.println("yang lulus ada " + mhsLulus);
        for(int i =0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];

        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata rata nilai = " + rata2);

    }
}
