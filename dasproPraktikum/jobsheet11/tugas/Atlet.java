import java.util.Arrays;

public class Atlet {
    public static void main(String[] args) {
        String badminton[] = {"ujang", "tatang", "iwan", "suep"} ;
        String pingPong[] = {"irana", "putri", "adit", "budi"} ;
        String basket[] = {"ming", "hansen", "robby", "fuad"} ;
        String volly[] = {"ucup", "harry", "fian", "asep"} ;
        
        Arrays.sort(badminton);
        Arrays.sort(pingPong);
        Arrays.sort(basket);
        Arrays.sort(volly);

        System.out.println("Badminton\n");
        for (String item : badminton) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("ping pong\n");
        for (String item : pingPong) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("basket\n");
        for (String item : basket) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("volly\n");
        for (String item : volly) {
            System.out.println(item);
        }


    }
}
