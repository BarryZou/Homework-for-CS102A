public class Ex2_1_2 {
    private static boolean odd(boolean a, boolean b, boolean c) {
        boolean k = (a && b && c) || (a && !b && !c) || (!a && b && !c) || (!a && !b && c);
        return k;
    }

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        System.out.println(odd(a, b, c));
    }
}
