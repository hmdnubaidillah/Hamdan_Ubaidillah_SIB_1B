package percobaan3;

import java.util.Scanner;

public class PemilihanPercobaan3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukan angka pertama : ");
        angka1 = input.nextDouble();

        System.out.print("Masukan angka kedua : ");
        angka2 = input.nextDouble();

        System.out.print("Masukan operator (+ - * /) : ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+' :
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                
            case '-' : 
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2  + " = " + hasil);
                break;
            case '*' :
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
        }
    }
}
