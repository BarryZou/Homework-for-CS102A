import java.util.Scanner;

public class Adjacent_numbers {
    public static boolean test(int[][] a, int n, int m) { //n:number of rows, m:number of columns
        if (n == 0 || m == 0) return false;
        else if (n == 1 && m == 1) return false;
        else if (n == 1) {
            for (int j = 0; j < m - 1; j++) {
                if (a[0][j] == a[0][j + 1]) return true;
            }
        } else if (m == 1) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i][0] == a[i+1][0]) return true;
            }
        } else if (n >= 2 && m >= 2) {
            for (int i = 0; i < n - 1; i++) { //Compare by rows
                for (int j = 0; j < m - 1; j++) {
                    if (a[i][j] == a[i][j+1] || a[i][j] == a[i+1][j]) return true;
                }
            }
            for (int j = 0; j < m - 1; j++) {
                if (a[n-1][j] == a[n-1][j+1]) return true;
            }
            for (int i = 0; i < n - 1; i++) {
                if (a[i][m-1] == a[i+1][m-1]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        if (T > 20 || T < 1) {
            System.exit(-1);
        }

        for (int times = 0; times < T; times++) {
            //Input the numbers of rows and columns
            int n = sc.nextInt();
            int m = sc.nextInt();

            //Input the matrix
            int[][] matrix = new int[n][m];
            for (int N = 0; N < n; N++) {
                for (int M = 0; M < m; M++) {
                    matrix[N][M] = sc.nextInt();
                }
            }

            //Test each matrix
            sb.append(test(matrix, n, m)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
