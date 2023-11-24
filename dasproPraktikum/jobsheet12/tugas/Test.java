/**
 * Test
 */
public class Test {

    public static void main(String[] args) {

        int nilaiMhs[][] = {
                { 20, 19, 25, 20, 10, 0, 10 }, // sari
                { 30, 30, 40, 10, 15, 20, 25 }, // rani
                { 5, 0, 20, 25, 10, 5, 45 }, // yani
                { 50, 0, 7, 8, 0, 30, 60 }, // dwi
                { 15, 10, 16, 15, 10, 10, 5 } // lusi
        };

        String namaMhs[] = { "Sari", "Rani", "Yani", "Dwi", "Lusi" };

        for (int i = 0; i < nilaiMhs.length; i++) {
            int foo = nilaiMhs[i][0];
            int counter = 1;

            for (int j = 0; j < nilaiMhs[i].length; j++) {

                if (foo > nilaiMhs[i][j]) {
                    continue;
                } else {
                    foo = nilaiMhs[i][j];
                }
                counter++;
            }
            System.out.println(namaMhs[i] + " minggu ke-" + " " + counter + " nilai " + foo);

        }

    }

}