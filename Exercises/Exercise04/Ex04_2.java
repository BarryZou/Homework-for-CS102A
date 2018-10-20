public class Ex04_2 {
    public static String noTabs(String s, int tabPosition) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tabPosition; i++) {
            sb.append(".");
        }
        char[] k = s.toCharArray();
        for (int i = 0; i < k.length; i++) {
            if (k[i] == '\n') break;
            if (k[i] == '\t') {
                for (int j = i + 1; j < k.length; j++) {
                    if (j == k.length - 1) {
                        int n = j - i - 1;
                        if (n > tabPosition) {
                            for (int q = 1; q <= n + 1; q++) {
                                sb.append(k[i + q]);
                            }
                            sb.append("..");
                        } else {
                            int m = tabPosition - (n + 1);
                            for (int q = 1; q <= n; q++) {
                                sb.append(k[i + q]);
                            }
                        }
                    } else if (k[j] == '\t') {
                        int n = j - i - 1;
                        if (n > tabPosition) {
                            for (int q = 1; q <= n; q++) {
                                sb.append(k[i + q]);
                            }
                            sb.append("..");
                        }
                        int m = tabPosition - n;
                        if (m >= 0) {
                            for (int q = 1; q <= n; q++) {
                                sb.append(k[i + q]);
                            }
                        }
                        for (; m > 0; m--) {
                            sb.append(".");
                        }
                        break;
                    }
                }
            }
        }
        sb.append("\\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(noTabs("\tabcde\t1234\txyz\tABCDEFGHIJKLMN\tOK\n", 8));
    }
}
