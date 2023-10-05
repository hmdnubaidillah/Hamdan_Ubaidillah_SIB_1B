package percobaan1;
import java.util.Scanner;

class Pemilihan2Percobaan1_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            int tahun = input.nextInt();

            if (tahun % 400 == 0) {
                System.out.println("Tahun kabisat");
            } else if (tahun % 100 == 0) {
                System.out.println("Tahun kabisat");
            } else if (tahun % 4 == 0) {
                System.out.println("Tahun kabisat");
            } else {
                System.out.println("Bukan tahun kabisat");
            }
        }
        
    }

}