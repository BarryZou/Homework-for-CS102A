import java.util.Scanner;

public class Ex2_1_5 {
    public static boolean areTriangular(double a, double b, double c) {
        boolean k = ((a + b > c) && (a + c > b) && (b + c > a));
        return k;

    }

    public static void main(String[] args) {
        System.out.println("Please input three numbers.");
        Scanner tri = new Scanner(System.in);
        double a = tri.nextDouble();
        double b = tri.nextDouble();
        double c = tri.nextDouble();
        System.out.println(areTriangular(a, b, c));
    }
}
