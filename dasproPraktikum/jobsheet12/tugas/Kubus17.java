package tugas;

public class Kubus17 {

    static double volumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    static double luasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {

        double volumeKubus = volumeKubus(2);
        double luasPermukaanKubus = luasPermukaanKubus(2);

        System.out.println(volumeKubus + " " + luasPermukaanKubus);
    }
}
