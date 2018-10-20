import static java.lang.System.out;

public class Ex2_1_1 {
    private static int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    private static double max3(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {
        out.println("The maximum of three is:" + max3(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }
}
