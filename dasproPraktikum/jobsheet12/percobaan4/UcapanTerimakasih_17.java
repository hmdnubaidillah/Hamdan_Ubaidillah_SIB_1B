package percobaan4;

import java.util.Scanner;

public class UcapanTerimakasih_17 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tulis nama orang yg mau diberi ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static String UcapanTambahan(String ucapan) {
        return ucapan;
    }

    public static void UcapanTerimakasih_17() {
        String nama = PenerimaUcapan();
        String ucapan = UcapanTambahan("Ucapan tambahan");
        System.out.println("Thanks " + nama + " " + ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih_17();

    }
}
