import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Please input a grade:");
        double g = grade.nextDouble();

        if (g <= 100 && g >= 90) {
            System.out.printf("Your grade is %.1f, the cooresponding GPA is 4.0", g);
        } else if (g <= 89 && g >= 80) {
            System.out.printf("Your grade is %.1f, the cooresponding GPA is 3.0", g);
        } else if (g <= 79 && g >= 70) {
            System.out.printf("Your grade is %.1f, the cooresponding GPA is 2.0", g);
        } else if (g <= 69 && g >= 60) {
            System.out.printf("Your grade is %.1f, the cooresponding GPA is 1.0", g);
        } else System.out.printf("Your grade is %.1f, the cooresponding GPA is 0", g);
    }
}
