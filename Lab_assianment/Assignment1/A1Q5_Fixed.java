package Assignment1;

public class A1Q5_Fixed {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = 0;

        //Display the reverse numbers
        if (a >= 1 && a <= 100000)
            while (a != 0) {
                if(a%10 == 0) {
                    a = a/10;
                } else {
                    b = a % 10;
                    System.out.print(b);
                    a = a / 10; }
            }
        else System.out.print("Out of range.");
    }
}
