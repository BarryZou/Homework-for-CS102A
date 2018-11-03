import java.util.Scanner;
import java.util.ArrayList;

public class Processing {
    public static int[][] add(int[][]arr, int k, int r) {
        for (int j = 0; j < arr[r].length; j++) {
            arr[r][j] = arr[r][j] + k;
        }
        return arr;
    }

    public static int[][] remove(int[][] arr, int r) {
        ArrayList<Integer> aL = new ArrayList<Integer>();
        for (int j = 0; j < arr[r].length; j++) {
            if (arr[r][j] != 0) aL.add(arr[r][j]);
        }
        Integer[] b = new Integer[aL.size()];
        aL.toArray(b);
        arr[r] = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            arr[r][i] = b[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        for (int times = 0; times < T; times++) { //T test cases
            int n = sc.nextInt(); //n: number of rows
            int m = sc.nextInt(); //m: number of operations

            int[][] arr = new int[n][]; //Define the two-dimensional array
            for (int i = 0; i < n; i++) {// Input each row
                arr[i] = new int[sc.nextInt()];//Input the length of row i
                for (int j = 0; j < arr[i].length; j++) { //Input the elements of row i
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int op = 0; op < m; op++) { //Do the operations
                int k = sc.nextInt();
                if (k == 0) {
                    arr = remove(arr, sc.nextInt());
                } else {
                    arr = add(arr, k, sc.nextInt());
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j != arr[i].length - 1) {
                        sb.append(arr[i][j] + " ");
                    } else {
                        sb.append(arr[i][j] + "\n");
                    }
                }
            }
        }
        System.out.print(sb.toString());
    }
}
