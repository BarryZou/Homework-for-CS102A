public class Ex1_3_43 {
    public static void main(String[] args) {

        //Define five integers
        long a = Integer.parseInt(args[0]);
        long b = Integer.parseInt(args[1]);
        long c = Integer.parseInt(args[2]);
        long d = Integer.parseInt(args[3]);
        long e = Integer.parseInt(args[4]);

        //Find their maximum and minimum
        long m = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        long M = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));

        long s = 0;
        if ((a - b) * (a - c) * (a - d) * (a - e) > 0) {
            s = s + a;
        }
        if ((b - a) * (b - c) * (b - d) * (b - e) > 0) {
            s = s + b;
        }
        if ((c - a) * (c - b) * (c - d) * (c - e) > 0) {
            s = s + c;
        }
        if ((d - a) * (d - b) * (d - c) * (d - e) > 0) {
            s = s + d;
        }
        if ((e - a) * (e - b) * (e - c) * (e - d) > 0) {
            s = s + e;
        }
        long middle = s - m - M;
        System.out.printf("The median value is %d", middle);
    }
}
