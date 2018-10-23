import java.util.Scanner;

public class Lab6_4 {
    public static void displayTriangle(int lineofHeight) {
        for (int i = lineofHeight - 1; i >= 0; i--) {
            for (int j = 1 - lineofHeight; j < lineofHeight; j++) {
                if (Math.abs(i) + Math.abs(j) > lineofHeight - 1) {
                    System.out.print("  ");
                } else System.out.print(lineofHeight - i + " ");
                if (j == lineofHeight - 1) {
                    System.out.print("\n");
                }
            }
        }
    }

    public static void displayTriangle(int lineofHeight, char ch) {
        for (int i = lineofHeight - 1; i >= 0; i--) {
            for (int j = 1 - lineofHeight; j < lineofHeight; j++) {
                if (Math.abs(i) + Math.abs(j) > lineofHeight - 1) {
                    System.out.print("  ");
                } else System.out.print(ch + " ");
                if (j == lineofHeight - 1) {
                    System.out.print("\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input an integer in [2, 9]:");
        int a = sc.nextInt();
        displayTriangle(a);
        System.out.println("Please input an integer in [2, 9]:");
        int b = sc.nextInt();
        System.out.println("Please input a char:");
        char ch = sc.next().charAt(0);
        displayTriangle(b, ch);
    }
}
