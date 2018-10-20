//This is an accepted edition

import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        if (T > 20 || T < 1) {
            System.exit(-1);
        }
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < T; j++) { //loop T times ( j from 0 to T-1 )
            int N = sc.nextInt();
            if (N > 1000 || N < 1) {
                System.exit(-1);
            }
            int[] a = new int[N]; //input a[]
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[N]; //sort a[] to b[]
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i];
            }
            Arrays.sort(b);

            for (int n = 0; n < b.length; n++) {
                for (int m = 0; m < a.length; m++) {
                    if (a[m] == b[n]) {
                        if (n == b.length - 1 && j != T - 1) {
                            sb.append(m + "\n");
                            a[m]--;
                            b[n]--;
                        } else {
                            sb.append(m + " ");
                            a[m]--;
                            b[n]--;
                        }
                    }
                }
            }
        }
        System.out.print(sb.toString()); //output
    }
}
