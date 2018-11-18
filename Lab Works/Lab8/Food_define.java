import java.util.Scanner;

public class Food_define {
    static class Food {
        private String name;
        private String type;
        static String DEFAULT_TYPE = "seafood";
        private int size;
        private double price;
        static final double DEFAULT_PRICE_FOR_SEAFOOD = 40;
        static final double DEFAULT_PRICE_FOR_BEEF = 35;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Food(String name, String type, int size, double price) {
            this.name = name;
            this.type = type;
            this.size = size;
            this.price = price;
        }

        public Food(String name, String type, int size) {
            this.name = name;
            this.type = type;
            this.size = size;
            if ("seafood".equals(type)) {
                this.price = DEFAULT_PRICE_FOR_SEAFOOD;
            } else if ("beef".equals(type)){
                this.price = DEFAULT_PRICE_FOR_BEEF;
            }
        }

        public Food(String name, int size) {
            this.name = name;
            this.type = DEFAULT_TYPE;
            this.size = size;
            this.price = DEFAULT_PRICE_FOR_SEAFOOD;
        }

        public String toString() {
            return this.type + " " + this.name + " : (" + this.size + " Inches) " + this.price + " $";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            String in = sc.nextLine();
            if ("".equals(in)) break;
            String[] arr = in.split(" ");
            if (arr.length == 2) {
                sb.append(new Food(arr[0], Integer.parseInt(arr[1])) + "\n");
            } else if (arr.length == 3) {
                sb.append(new Food(arr[0], arr[1], Integer.parseInt(arr[2])) + "\n");
            } else if (arr.length == 4) {
                sb.append(new Food(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3])) + "\n");
            }
        }
        System.out.print(sb.toString());
    }
}
