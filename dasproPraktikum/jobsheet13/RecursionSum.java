public class RecursionSum {

    static int sum(int x) {

        if (x <= 1) {
            return x;

        } else {

            return x + sum(x - 1);
        }
    }

    public static void main(String[] args) {

        int foo = sum(5);

        System.out.println(foo);

    }
}
