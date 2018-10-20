public class Ex1_3_8 {
    //Rewrite TenHellos
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        while (i <= n) {
            if(i%100 == 11 || i%100 == 12 || i%100 == 13) {
                System.out.println(i + "th Hello");
                i = i+1;
            } else if (i%10 == 1) {
                System.out.println(i + "st Hello");
                i = i+1;
            } else if (i%10 == 2) {
                System.out.println(i + "nd Hello");
                i = i+1;
            } else if (i%10 == 3) {
                System.out.println(i + "rd Hello");
                i = i+1;
            } else {
                System.out.println(i + "th Hello");
                i = i+1;
            }
        }

    }
}
