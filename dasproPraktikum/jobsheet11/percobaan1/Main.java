package percobaan1;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Masukan nilai N = ");
        // int N = sc.nextInt();


        String star = "";

        for (int i = 1; i<= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}