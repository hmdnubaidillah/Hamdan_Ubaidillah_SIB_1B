package percobaan1;
import java.util.Scanner;

class ForKeliapatan_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukan bilangan kelipatan (1-9) ");
        kelipatan = scan.nextInt();

        for (int i = 1 ; i <= 50 ; i++) {

            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        float average = jumlah / counter;

        System.out.printf("banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("total rata rata bilangan kelipatan %d adalah %s\n",jumlah, average);
    }
}