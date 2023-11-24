package percobaan3;

import java.util.Scanner;

/**
 * Ucapan_17
 */
public class Ucapan_17 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tulis nama orang");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();

        System.out.println("Thanks " + nama);
    }
}