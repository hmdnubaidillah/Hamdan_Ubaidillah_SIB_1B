package percobaan1;
import java.util.Scanner;

class PemilihanPercobaan1_17 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int angka = input.nextInt();

        String hasil  = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(hasil);
    }
}