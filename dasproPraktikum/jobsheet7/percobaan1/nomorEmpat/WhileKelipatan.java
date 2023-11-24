package percobaan1.nomorEmpat;

import java.util.Scanner;

public class WhileKelipatan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0, i = 0;

        System.out.print("Masukan bilangan kelipatan (1-9) ");
        kelipatan = scan.nextInt();

        while (i <= 50) {
            i++;

            if (i % kelipatan == 0) {
               jumlah += i;
                 counter++;
             }
        }
        float average = jumlah / kelipatan;

        System.out.printf("banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("total rata rata bilangan kelipatan %d adalah %s\n",jumlah, average);
    }
}
