package Assignment1;

public class A1Q3 {
    public static void main(String[] args) {
        double l = Double.parseDouble(args[0]);
        double t54 = Math.toRadians(54);

        //Calculate the areas
        double t = Math.pow(l, 2) * Math.pow(3, 0.5) * 0.25;
        double q = Math.pow(l, 2);
        double p = 1.25 * Math.pow(l, 2) * Math.tan(t54);
        double h = 1.5 * Math.pow(l, 2) * Math.pow(3, 0.5);

        //Display the answers
        System.out.printf("%.2f\n%.2f\n%.2f\n%.2f", t, q, p, h);
    }
}
