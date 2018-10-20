//This is an accepted edition

import java.util.Scanner;

public class A_Multiplication_Game {
    public static void main(String[] args) {
        long c[] = {2,9,3,5,7};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T > 20 || T < 1) {
            System.out.print("Out of range");
            System.exit(-1);
        }


        for (int times = 0; times < T; times++) { //loop T times

            int P = sc.nextInt();
            if (P > 19 || P < 1) {
                System.out.print("Out of range");
                System.exit(-1);
            }
            long a[] = new long [P]; //input P numbers
            for (int i = 0; i < P; i++) {
                long temp = sc.nextLong();
                if (temp >= 1) {
                    a[i] = temp;
                } else System.exit(-1);
            }

            long b[] = new long[P]; //Transfer numbers to indices
            for (int i = 0; i < b.length; i++) {
                long temp2 = c[(int)(a[i]%5)];
                if(a[i]%2 != 0) {
                    b[i] = temp2;
                } else b[i] = 1;
            }

            long product = 1; //output the product
            for (int i = 0; i < b.length; i++) {
                product = product * b[i];
            }
            System.out.println(product);
        }
    }
}
