import java.util.Scanner;

public class Ex2_1_9 {
    private static double lg(double n) {
        return Math.log(n)/Math.log(2);
    }

    public static void main(String[] args) {
        System.out.println("Please input a number to calculate the base-2 logarithm of it:");
        Scanner lg = new Scanner(System.in);
        double n = lg.nextDouble();
        System.out.println("The answer is " + lg(n));
    }
}
