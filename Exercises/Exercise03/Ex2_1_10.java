import java.util.Scanner;

public class Ex2_1_10 {
    private static double lg(double n) {
        double x = 0;
        double t = n;
        while (t/2 >= 1) {
            t = t/2;
            x = x + 1;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Please input a number to calculate the base-2 logarithm of it:");
        Scanner lg = new Scanner(System.in);
        double n = lg.nextDouble();
        System.out.println("The answer is " + lg(n));
    }
}
