import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {
        double w[] = new double[10];
        System.out.print("Please input 10 scores of these students:");
        Scanner k = new Scanner(System.in);
        double temp = 0;
        for(int i = 0; i < w.length; i++) {
            temp = k.nextDouble();
            if (temp <= 100 && temp >= 0) {
                w[i] = temp;
            } else {
                System.out.println("Score out of range");
                System.exit(0);
            }
        }
        double m = w[0];
        for(int i = 1; i < w.length; i++) {
            if(w[i] > m) m = w[i];
        }
        double n = w[0];
        for(int i = 1; i < w.length; i++) {
            if(w[i] < n) n = w[i];
        }
        double sum = 0;
        for(double e: w) {
            sum = sum + e;
        }
        sum = sum - m - n;
        System.out.printf("%s%.2f","Average score is ",sum/8);
    }
}
