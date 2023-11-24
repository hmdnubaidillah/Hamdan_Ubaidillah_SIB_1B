package percobaan6;

import java.util.Scanner;

public class Percobaan_17_Fun {

    static int hitungLuas(int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int vol = hitungLuas(a, b) * tinggi;

        return vol;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukan panjang");
        p = input.nextInt();

        System.out.println("Masukan lebar");
        l = input.nextInt();

        System.out.println("Masukan tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("voulme balok adalah " + vol);
    }
}
