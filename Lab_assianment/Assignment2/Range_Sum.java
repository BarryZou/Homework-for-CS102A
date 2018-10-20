//Accepted Version
import java.util.Scanner;

public class Range_Sum {
    // define the sum up operation
    private static int S(int i, int j, int a[]) {
        int sum = 0;
        for (; i <= j; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    //define the delete operation
    private static int[] D(int k, int a[]) {
        int[] b = new int[a.length - 1];
        int i = 0;
        for (; a[i] != k; i++) {
            b[i] = a[i];
        }
        for (; i < b.length; i++) {
            b[i] = a[i + 1];
        }
        return b;
    }

    //define the insert operation
    private static int[] I(int i, int x, int a[]) {
        int b[] = new int[a.length + 1];
        for (int m = 0; m < i; m++) {
            b[m] = a[m];
        }
        b[i] = x;
        for (int m = i + 1; m < b.length; m++) {
            b[m] = a[m - 1];
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        if (T > 10 || T < 1) {
            System.exit(-1);
        }

        //loop T times
        for (int times = 0; times < T; times++) {
            int N = sc.nextInt();
            if (N > 1000 || N < 1) {
                System.exit(-1);
            }
            int[] a = new int[N]; //input a[]
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            int q = sc.nextInt(); //input q
            if (q > 20 || q < 1) {
                System.exit(-1);
            }

            for (int q0 = 0; q0 < q; q0++) {
                String op = sc.next();
                if (op.equals("I")) {
                    int i = sc.nextInt();
                    int x = sc.nextInt();
                    a = I(i, x, a);
                } else if (op.equals("D")) {
                    int x = sc.nextInt();
                    a = D(x, a);
                } else if (op.equals("S")) {
                    int i = sc.nextInt();
                    int j = sc.nextInt();
                    if (times != T - 1 || q0 != q - 1) {
                        sb.append(S(i, j, a) + "\n");
                    } else sb.append(S(i, j, a));
                }
            }
        }
        System.out.print(sb.toString());
    }
}
