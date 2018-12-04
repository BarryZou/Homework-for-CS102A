import java.util.Scanner;

public class Sudoku {
    public static String isSudoku(int[][] arr) {
        boolean bl = true;
        a:
        for (int i = 0; i < 9; i++) { //Compare by rows
            for (int j = 0; j < 8; j++) {
                for (int k = j + 1; k < 9; k++) {
                    if (arr[i][j] == arr[i][k]) {
                        bl = false;
                        break a;
                    }
                }
            }
        }

        if (bl) { //Compare by columns
            b:
            for (int j = 0; j < 9; j++) {
                for (int i = 0; i < 8; i++) {
                    for (int k = i + 1; k < 9; k++) {
                        if (arr[i][j] == arr[k][j]) {
                            bl = false;
                            break b;
                        }
                    }
                }
            }
        }

        if(bl) { //Compare by each small square matrix
            c:
            for (int m = 0; m <= 6; m+=3) {
                for (int n = 0; n <= 6; n+=3) {
                    int[] temp = new int[9];
                    int index = 0;
                    for (int i = m; i < m+3; i++) { //Output numbers in the small square into an array
                        for (int j = n; j < n+3; j++) {
                            temp[index] = arr[i][j];
                            index++;
                        }
                    }
                    for (int i = 0; i < temp.length - 1; i++) {
                        for (int k = i+1; k < temp.length; k++) {
                            if (temp[i] == temp[k]) {
                                bl = false;
                                break c;
                            }
                        }
                    }
                }
            }
        }
        if (bl) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for (int times = 0; times < T; times++) {
            //Input the Sudoku
            int[][] Su = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    Su[i][j] = sc.nextInt();
                }
            }
            sb.append(isSudoku(Su)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
