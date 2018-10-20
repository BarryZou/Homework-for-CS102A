import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {

        Scanner precision = new Scanner(System.in);
        System.out.println("Please input a precision:");
        double p = precision.nextDouble();

        double i = 1;
        double pi = 0;

        while (4 > (2*i - 1)*p) {
            if ( (2*i - 1)%4 == 1) {
                pi = pi + 4/(2*i - 1);
            } else {
                pi = pi - 4/(2*i - 1);
            }
            i++;
        }
        System.out.printf("%f\n%d iterations\n", pi, (int)(i-1));
    }
}
