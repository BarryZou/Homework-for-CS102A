package Assignment1;

public class A1Q6_Fixed {
    public static void main(String[] args) {
        double w = 0.28;
        double l = 100 - 0.28;
        double w1 = w;
        double l1 = l;
        int r = Integer.parseInt(args[0]);


        //Compute the month of to reach the winning rate
        if (r <= 100 && r >= 0) {
            int month = 1;
            while (w1 < r) {
                l1 = l1 * l / 100.0;
                System.out.println(l1);
                w1 = 100 - l1;
                month = month + 1;
            }

            //Tranfer month to year
            int y = month / 12;
            int m = month % 12;
            if (y != 0) {
                System.out.println(y + " y " + m + " m ");
            } else {
                System.out.println(m + " m ");
            }
        } else {
            System.out.println("Rate out of range.");
        }
    }
}
