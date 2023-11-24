package percobaan4;

import java.util.Scanner;

public class LinearSearch17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrLength = sc.nextInt();
        int keyValue = sc.nextInt();

        int[] arrint = new int[arrLength];
        int key = keyValue;
        int hasil = 0;

        for (int i = 0; i < arrint.length; i++) {
            if (arrint[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada dalam array pada posisi indeks ke=-" + hasil);
    }
}
