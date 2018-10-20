public class Spring_Lab {
    public static void main(String[] args) {
        for(int j = 9; j >= -9; j--) {
            for(int i = -9; i <= 9; i++) {
                if(Math.abs(i)+Math.abs(j) > 9) {
                    if(i == 9) {
                        System.out.println(" ");
                    } else System.out.print("  ");
                } else if(i == 9) {
                    System.out.println(Math.abs(i));
                } else System.out.print(Math.abs(i) + " ");
            }
        }
    }
}
