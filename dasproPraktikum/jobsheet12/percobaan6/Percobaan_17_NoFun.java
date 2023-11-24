package percobaan6;

import java.util.Scanner;

public class Percobaan_17_NoFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukan panjang");
        p = input.nextInt();

        System.out.println("Masukan lebar");
        l = input.nextInt();

        System.out.println("Masukan tinggi");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);

        vol = p * l * t;
        System.out.println("voulme balok adalah " + vol);
    }
}
