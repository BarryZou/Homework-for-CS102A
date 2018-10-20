import java.util.Random;

public class Lab5_3 {
    public static void main(String[] args) {
        int dice[] = {1,2,3,4,5,6};
        Random r = new Random();
        int [] a = new int[36000000];
        int [] b = new int[36000000];
        int [] n = {0,0,0,0,0,0,0,0,0,0,0};
        int sum = 0;
        for(int i = 0; i < 36000000; i++) {
            a[i] = r.nextInt(dice.length);
            b[i] = r.nextInt(dice.length);
            sum = a[i] + b[i];
            for(int j = 0; j < 11; j++) {
                if(sum == j) {
                    n[j] = n[j] + 1;
                }
            }
        }
        for(int i = 0;i < n.length; i++) {
            System.out.printf("%d%s%d\n",i+2,": ",n[i]);
        }
    }
}
