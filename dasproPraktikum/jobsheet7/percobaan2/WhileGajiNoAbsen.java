import java.util.Scanner;

public class WhileGajiNoAbsen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("masukan jumlah karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Pilihan jabatan = direktur, manajer, karyawan");
            System.out.print("masukan jabatan karyawan ke-" + (i+1) + ": ");

            jabatan = sc.nextLine();
            System.out.print("masukan jumlah jam lembur : ");
            
            jumlahJamLembur = sc.nextInt();
            i++;
            
            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } 
            else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100_000;
            }
            
            else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75_000;  
            } 
            else {
                System.out.println("invalid");
               
           }
           i--;
           
        }
        totalGajiLembur += gajiLembur;
        System.out.println("total gaji lembur: " + totalGajiLembur);
      
    }
}
