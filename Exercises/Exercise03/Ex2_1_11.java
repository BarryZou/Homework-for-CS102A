import java.util.Scanner;

public class Ex2_1_11 {
    public static String signum(int n) {
        String a = "";
        if (n < 0) {
            a = "-1";
        } else if (n > 0) {
            a = "+1";
        } else if (n == 0) {
            a = "0";
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Please input a number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(signum(n));
    }
}
