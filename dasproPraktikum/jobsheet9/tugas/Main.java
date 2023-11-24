package tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan panjang array : ");
        int arrLength = input.nextInt();

        int[] arr = new int[arrLength];

        for (int i = 0; i< arr.length; i++) {
            System.out.print("Masukan value ke array index ke-" + i + " ");
            arr[i] = input.nextInt();
        }
        
        // max
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Nilai terbesar : " + max);

        // min
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Nilai terkecil : " + min);

        // average
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
          avg += arr[i];
        }
        System.out.println("Rata2 : " + avg);

    }
}
