import java.util.Scanner;

public class Ex2_1_7 {
    public static double sqrt(double a) {
        double x = 1.0;
        while (Math.abs(Math.pow(x, 2) - a) > 1e-9) {
            x = (x + a / x) / 2;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Please insert a number to calculate its square root:");
        Scanner n = new Scanner(System.in);
        double a = n.nextDouble();
        System.out.println("The square root of " + a + " is " + sqrt(a));
    }
}
