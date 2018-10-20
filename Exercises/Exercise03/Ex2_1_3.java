public class Ex2_1_3 {
    public static boolean majority(boolean a, boolean b, boolean c) {
        boolean m = (a && b && c) || (a && b && !c) || (a && !b && c) || (!a && b && c);
        return m;
    }

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        System.out.println(majority(a, b, c));
    }
}
