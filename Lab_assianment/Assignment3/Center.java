import java.util.Scanner;

public class Center {
    public static String center(int[][] arr) {
        StringBuilder SB = new StringBuilder();
        int max = 0;
        for (int i = 0; i < arr.length; i++) { //Get the maximum length
            if (arr[i].length > max) max = arr[i].length;
        }
        for (int i = 0; i < arr.length; i++) { //Operations by row
                int d = (max - arr[i].length)/2;
                for (int j = 0; j < d; j++) {
                    SB.append("  ");
                }
                for (int j = d; j < max - d; j++) {
                    SB.append(arr[i][j-d] + " ");
                }
                for (int j = max - d; j < max; j++) {
                    SB.append("  ");
                }
                SB.append("\n");
            }
        return SB.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        for (int times = 0; times < T; times++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][];
            for (int i = 0; i < n; i++) { //Create the array
                int k = sc.nextInt();
                arr[i] = new int[k];
            }
            for (int i = 0; i < arr.length; i++) { //Input numbers to the array
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            sb.append(center(arr));
        }
        System.out.print(sb.toString());
    }
}
