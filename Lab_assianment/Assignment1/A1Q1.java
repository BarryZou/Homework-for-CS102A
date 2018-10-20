package Assignment1;

public class A1Q1 {
    public static void main(String[] args) {
        //Read the radius
        int r = Integer.parseInt(args[0]);

        //Compute
        double s = Math.pow(r,2) * Math.PI;
        double c = 2 * Math.PI * r;

        //Display
        System.out.printf("%.2f\n%.2f",s,c);
    }
}
