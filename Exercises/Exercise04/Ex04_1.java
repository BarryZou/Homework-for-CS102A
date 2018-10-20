public class Ex04_1 {
    private static String diamond(int n, char flash, char blank) {
        StringBuilder k = new StringBuilder();
        for (int j = n - 1; j > -n; j--) {
            for (int i = -n + 1; i < n; i++) {
                if (i + Math.abs(j) > n - 1) {
                    k.append(" ");
                } else if (Math.abs(i) + Math.abs(j) == n - 1) {
                    k.append(flash);
                } else if (j >= 0 && i == 0) {
                    k.append(flash);
                } else if (j == 0) {
                    k.append(flash);
                } else if (j < 0 && Math.abs(i) != 0 && Math.abs(i) + Math.abs(j) < n - 1) {
                    k.append(flash);
                } else {
                    k.append(blank);
                }
                if (i == n - 1) {
                    k.append("\n");
                }
            }
        }
        return k.toString();
    }

    private static String diamond(int n, char flash) {
        return diamond(n, flash, ' ');
    }

    private static String diamond(int n) {
        return diamond(n, '*');
    }

    private static String diamond() {
        return diamond(8);
    }

    public static void main(String[] args) {
        System.out.println(diamond());
        System.out.println(diamond(5));
        System.out.println(diamond(7, '*'));
        System.out.println(diamond(6, '@', '.'));
    }
}
