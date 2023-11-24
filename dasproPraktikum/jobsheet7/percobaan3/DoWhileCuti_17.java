import java.util.Scanner;

class DoWhileCuti_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari = 0;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t)");
            konfirmasi = sc.next();

            if (konfirmasi.equals("t")) break;
            
            if (konfirmasi.equals("y")) {
                System.out.println("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi ");
                   
                }
            }

        } while(jatahCuti > 0);
    }
}
