package Assignment1;

public class A1Q4 {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double x2 = Double.parseDouble(args[3]);
        double y2 = Double.parseDouble(args[4]);

        //Compute the distance
        double m1 = x1 - x2;
        double m2 = y1 - y2;
        double d2 = Math.pow(m1, 2) + Math.pow(m2, 2);
        double d = Math.pow(d2, 0.5);

        //Compare distance to radius
        boolean a = d <= r;
        System.out.printf("%b\n", a);
    }
}
