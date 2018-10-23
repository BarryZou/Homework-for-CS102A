import java.util.Scanner;

public class Lab6_1 {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.pow(p*(p - a)*(p - b)*(p - c), 0.5);
    }

    public static double perimeter(double a, double b, double c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input three numbers for a, b, c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.printf("%s%.3f%s","The area is ",area(a, b, c),"\n");
        System.out.printf("%s%.3f%s","The perimeter is ",perimeter(a, b, c),"\n");
    }
}
