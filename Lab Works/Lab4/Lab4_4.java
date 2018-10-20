public class Lab4_4 {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            int i = 1;
            for (; i <= j; i++) {
                System.out.printf("%d * %d = %d\t", i, j, i*j);
            } System.out.print("\n");
        }
    }
}
