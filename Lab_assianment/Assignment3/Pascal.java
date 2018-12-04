import java.util.Scanner;

public class Pascal {
    public static String Draw(int n, int[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr[n-1].length; i++) {
            sb.append(arr[n-1][i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();

        //Create the pascal's triangle
        int[][] pas = new int [33][];
        for (int i = 0; i < pas.length; i++) {
            pas[i] = new int[i+1];
        }
        pas[0][0] = 1;
        pas[1][0] = 1;
        pas[1][1] = 1;
        for (int i = 2; i < pas.length; i++) { //Calculate the i+1 th row
            pas[i][0] = 1;
            pas[i][i] = 1;
            for (int j = 1; j < pas[i].length - 1; j++) {
                pas[i][j] = pas[i-1][j-1] + pas[i-1][j];
            }
        }

        for (int times = 0; times < T; times++) {
            int n = sc.nextInt();
            sb.append(Draw(n, pas)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
