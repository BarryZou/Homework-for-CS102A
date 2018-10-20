import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the length of myList:");
        int length = k.nextInt();
        System.out.print("Enter " + length + " values:\t");
        double myList[] = new double[length];
        for(int i = 0; i < myList.length; i++) {
            myList[i] = k.nextDouble();
        }
        System.out.print("The array:");
        for(int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        double b[] = new double[length];
        b[length-1] = myList[0];
        for(int i = 0; i < b.length-1; i++) {
            b[i] = myList[i+1];
        }
        System.out.print("\nThe shifted array:");
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
