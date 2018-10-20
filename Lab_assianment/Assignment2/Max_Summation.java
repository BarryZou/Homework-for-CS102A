import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Max_Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //Input T
        if (T > 20 || T < 1) {
            System.out.println("Invalid input");
            System.exit(-1);
        }

        for (int t = 0; t < T; t++) { //loop T times
            int N = sc.nextInt(); //Input N
            if (N > 1000 || N < 1) {
                System.out.println("Invalid input");
                System.exit(-1);
            }

            //input array a[]
            int[] a = new int[N];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            //
            ArrayList<Long> al = new ArrayList<Long>();
            int i = 0;
            for (; i < a.length; i++) {
                for (int j = i; j < a.length; j++) {
                    long sum = a[i];
                    for (int k = i; k <= j; k++) {
                        if (i != j && k != i) {
                            sum = sum + a[k];
                        }
                        al.add(sum);
                    }
                }
            }
            System.out.println(Collections.max(al));
        }
    }
}