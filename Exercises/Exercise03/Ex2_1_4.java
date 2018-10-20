public class Ex2_1_4 {
    private static boolean eq(int []a, int []b) {
        boolean k = (a.length == b.length);
        return k;
    }

    public static void main(String[] args) {
        int []a = {1,3,4,5,6};
        int []b = {1,3,4,5,6};
        boolean m = true;
        for (int i = 0; (i < a.length); i++) {
            if(a[i] != b[i]) {
                m = false;
            }
        }
        System.out.println(eq(a, b) && m);
    }
}
