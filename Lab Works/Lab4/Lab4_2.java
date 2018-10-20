import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        System.out.println("Please input an integer between 0 and 9:");
        Scanner num = new Scanner(System.in);
        int r = (int) (Math.random() * 10);

        int s = 0;
        while (s != r) {
            s = num.nextInt();
            if (s > r) {
                System.out.println("Too high! Please try again:");
            } else if (s < r) {
                System.out.println("Too low! Please try again:");
            }
        }
        System.out.println("Congratulations!");
    }
}
