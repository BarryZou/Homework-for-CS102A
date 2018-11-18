import java.util.Scanner;
import java.util.ArrayList;

public class User_define {
    static class User {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        private String name;
        private String password;
        private double money;
        static final String DEFAULT_PASSWORD = "123456";
        static final double DEFAULT_MONEY = 1000.0;
        public User(String name, String password, double money) {
            this.name = name;
            this.password = password;
            this.money = money;
        }
        public User(String name) {
            this.name = name;
            this.password = DEFAULT_PASSWORD;
            this.money = DEFAULT_MONEY;
        }
        public String toString() {
            return this.name + " has " + this.money + " dollars.\n";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            String in = sc.nextLine();
            if ("".equals(in)) break;
            String[] values = in.split(" ");
            if (values.length != 1) {
                String name = values[0];
                String password = values[1];
                double money = Double.parseDouble(values[2]);
                sb.append(new User(name, password, money));
            } else {
                String name = values[0];
                sb.append(new User(name));
            }
        }
        System.out.print(sb.toString());
    }
}
