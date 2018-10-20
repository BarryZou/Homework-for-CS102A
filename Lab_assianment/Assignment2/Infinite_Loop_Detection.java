import java.util.Scanner;

public class Infinite_Loop_Detection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //Input T
        if (T > 20 || T < 1) {
            System.out.println("Invalid input");
            System.exit(-1);
        }
        boolean c[] = new boolean[T];

        for (int t = 0; t < T; t++) { //loop T times

            int P = sc.nextInt(); //Input P
            if (P > 1000 || P < 1) {
                System.out.println("Invalid input");
                System.exit(-1);
            }

            int a[] = new int[P];
            for (int p = 0; p < P; p++) { //Input P numbers
                int temp = sc.nextInt();
                if (temp < P && temp >= -1) {
                    a[p] = temp;
                }
            }

            for (int i = 0; i < P; i++) {
                int j = i;
                boolean b[] = new boolean[P];
                while (a[j] != -1) {
                    if (!b[j]) {
                        b[j] = true;
                        j = a[j];
                    } else {
                        c[t] = true;
                        break;
                    }
                }
            }
        }
        for (boolean e : c) {
            System.out.println(e);
        }
    }
}
