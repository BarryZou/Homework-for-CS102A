public class Ex1_3_12 {
    public static void main(String[] args) {
        double n = 16;
        for (; n <= 2048; n = n*2) {
            System.out.printf("%16.2f%16.2f%16.2f%16.2f%16.2f%16.2g\n", Math.log(n), n, n * Math.log(n), Math.pow(n, 2), Math.pow(n, 3), Math.pow(2, n));
        }
    }
}
