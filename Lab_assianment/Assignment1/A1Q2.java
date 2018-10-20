package Assignment1;

public class A1Q2 {
    public static void main(String[] args) {

        //Input the four arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        //Calculate
        int MAX_VALUE = Math.max(a, Math.max(b, Math.max(c, d)));
        int MIN_VALUE = Math.min(a, Math.min(b, Math.min(c, d)));
        double AVERAGE_VALUE = (a + b + c + d) / 4;

        //Display the answers
        System.out.printf("%d\n%d\n%.2f", MAX_VALUE, MIN_VALUE, AVERAGE_VALUE);
    }
}
