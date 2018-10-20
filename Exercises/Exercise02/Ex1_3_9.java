public class Ex1_3_9 {
    public static void main(String[] args) {
        //This program prints 1000 to 2000 four at a line
        int i = 1000;
        for (; i <= 2000; i++) {
            if (i%5 == 4) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
