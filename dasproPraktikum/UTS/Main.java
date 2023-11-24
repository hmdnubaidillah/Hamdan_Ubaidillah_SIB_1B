import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah peserta : ");
        int peserta = input.nextInt();

        System.out.println("Jumlah peserta yang mengikuti tes : " + peserta);

        for (int i = 1 ; i <= peserta ; i++) {
            
            System.out.printf("Masukan nilai tes potensi akademik peserta %d : ",i);
            float akademik = input.nextFloat();

            System.out.printf("Masukan nilai tes b inggris peserta %d : ",i);
            float bing = input.nextFloat();

            System.out.printf("Masukan nilai tes nasionalisme peserta %d : ",i);
            float nasionalisme = input.nextFloat();

            float testResult = akademik + bing + nasionalisme;
            float average = testResult / 3;
            
            System.out.printf("Hasil rata rata tes peserta %d adalah %s: \n", i, average);

            if (akademik < 75 && bing < 75 && nasionalisme < 75) {
                System.out.printf("peserta %d dinyatakan tidak lolos tahap tes akademik\n\n", i);
                
            } 
            else if (average < 78) {
               System.out.printf("peserta %d dinyatakan tidak lolos tahap tes akademik\n", i);

            } else {
                Scanner inputIpk = new Scanner(System.in);

                System.out.printf("Masukan ipk peserta %d : ", i);
                float ipk = inputIpk.nextFloat();
                
                if (ipk < 3.25){
                    System.out.printf("peserta %d dinyatakan tidak lolos tahap tes berkas", i);
                   
                
                } else {

                    Scanner inputSehat = new Scanner(System.in);
                    System.out.printf("Apakah peserta %d sehat jasmani rohani (y/t) : ", i);
                    String sehat = inputSehat.nextLine();

                    if (sehat.equalsIgnoreCase("y")) {
                        System.out.printf("peserta %d dinyatakan lolos tahap tes berkas\n", i);
                    } 
                    else {
                        System.out.printf("peserta %d dinyatakan tidak lolos tahap tes berkas\n", i);
                    }
                }
            }
        }
    }
}