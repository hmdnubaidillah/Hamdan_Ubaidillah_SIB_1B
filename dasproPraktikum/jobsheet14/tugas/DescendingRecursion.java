
public class DescendingRecursion {

    static void descendingIteratif() {
        for (int i = -5; i <= 0; i++) {
            System.out.println(i);
        }
    }

    static void descendingRecursion(int n) {
        if (n <= 0) {
            System.out.println(n);
            descendingRecursion(n + 1);
        }
    }

    public static void main(String[] args) {
        // descendingIteratif();
        descendingRecursion(-5);

    }
}
