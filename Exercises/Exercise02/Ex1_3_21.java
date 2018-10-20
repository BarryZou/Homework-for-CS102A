public class Ex1_3_21 {
    public static void main(String[] args) {
        //This is the Kary program
        int n = 0;
        long i = Long.parseLong(args[0]);
        double c = i;
        int k = Integer.parseInt(args[1]);

        //Find out the digit of "i" in base "k"
        for (; i >= Math.pow(k, n); n++) ;

        //Converts i to base k
        while (n != 0) {
            if (c / Math.pow(k, n - 1) == 15) {
                System.out.print("F");
            } else if (c / Math.pow(k, n - 1) == 14) {
                System.out.print("E");
            } else if (c / Math.pow(k, n - 1) == 13) {
                System.out.print("D");
            } else if (c / Math.pow(k, n - 1) == 12) {
                System.out.print("C");
            } else if (c / Math.pow(k, n - 1) == 11) {
                System.out.print("B");
            } else if (c / Math.pow(k, n - 1) == 10) {
                System.out.print("A");
            } else {
                System.out.print((int) (c / Math.pow(k, n - 1)));
            }
            c = c % Math.pow(k, n - 1);
            n--;
        }
    }
}
