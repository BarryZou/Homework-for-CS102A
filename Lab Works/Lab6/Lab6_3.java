import java.util.Scanner;

public class Lab6_3 {
    public static double area(double bottom, double height) {
        return bottom*height/2;
    }

    public static double area(double a, double b, float angleOfAandB) {
        return a*b*Math.sin(angleOfAandB*Math.PI/180)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two numbers for bottom and height:");
        double bottom = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.printf("%s%.3f%s", "The area is ", area(bottom, height), "\nPlease input two numbers for a and b:\n");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Please input a number in (0, 180) for angle (angle is a float variable):");
        float angleOfAandB = sc.nextFloat();
        System.out.printf("%s%.3f", "The area is ", area(a, b, angleOfAandB));
    }
}
