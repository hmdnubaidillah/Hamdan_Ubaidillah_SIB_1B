package percobaan2;

import java.util.Scanner;

public class Pemilihan2Percobaan2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan 3 sudut segitiga");
        float sudut1 = input.nextInt();
        float sudut2 = input.nextInt();
        float sudut3 = input.nextInt();
        
        float totalSudut = sudut1 + sudut2 + sudut3;

        if ( totalSudut == 180) {
            if (sudut1 == 60 && sudut2 == 60 && sudut3 == 60){
                System.out.println("segitiga sama sisi");
            } 
            else if (sudut1 == sudut2){
                System.out.println("Segitiga sama kaki");
            } else {
                System.out.println("Segitiga sembarang");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}
