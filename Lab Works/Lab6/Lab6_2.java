import java.util.Scanner;

public class Lab6_2 {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.pow(p*(p - a)*(p - b)*(p - c), 0.5);
    }

    public static boolean isValid(double a, double b, double c) {
        return ((a + b) > c) || ((b + c) > a) || ((a + c) > b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input three numbers for a, b, c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (isValid(a, b, c)) {
            System.out.printf("%s%.3f%s","The area is ",area(a, b, c),"\n");
        } else {
            System.out.printf("%s","The input is invalid\n");
        }
    }
}
