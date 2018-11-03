public class Rational_define {
    static class Rational {
        private int nu;
        private int de;
        public Rational(int nu, int de) {
            this.nu = nu;
            this.de = de;
        }
        public void setNu(int nu) {
            this.nu = nu;
        }
        public void setDe(int de) {
            this.de = de;
        }
        public int getNu() {
            return this.nu;
        }
        public int getDe() {
            return this.de;
        }
        public Rational Abs(){
            if (this.nu*this.de > 0) {
                return new Rational(Math.abs(this.nu), Math.abs(this.de));
            } else if (this.nu*this.de < 0) {
                return new Rational(-Math.abs(this.nu), Math.abs(this.de));
            } else {
                return new Rational(0, 1);
            }
        }
        public Rational Simp() { //Using Euclidean algorithm
            int a = Math.max(this.nu, this.de);
            int b = Math.min(this.nu, this.de);
            while (a%b != 0) {
                    int t = a%b;
                    a = b;
                    b = t;
            } //Greatest common divisor b found
            return new Rational(this.nu/b, this.de/b);
        }
        public boolean Equals(Rational a) {
            return (this.nu*a.de == this.de*a.nu);
        }
        public Rational Add(Rational a) {
            Rational temp = new Rational((this.nu*a.de+this.de*a.nu), (this.de*a.de));
            return temp.Simp().Abs();
        }
        public Rational Subtract(Rational a) {
            Rational temp = new Rational((this.nu*a.de-a.nu*this.de), (this.de*a.de));
            return temp.Simp().Abs();
        }
        public Rational Multiply(Rational a) {
            Rational temp = new Rational(this.nu*a.nu, this.de*a.de);
            return temp.Simp().Abs();
        }
        public Rational Divide(Rational a) {
            if (a.nu == 0) {
                System.out.println("Division invalid.");
                return null;
            } else {
               Rational temp = new Rational(this.nu*a.de, this.de*a.nu);
               return temp.Simp().Abs();
            }
        }
        public String toString() {
            return this.nu + "/" + this.de;
        }
    }
    public static void main(String[] args) {
        Rational a = new Rational(4,8);
        Rational b = new Rational(7,56);
        System.out.println("Rational a is " + a + " , and Rational b is " + b);
        System.out.println("a + b is " + a.Add(b));
        System.out.println("a - b is " + a.Subtract(b));
        System.out.println("a * b is " + a.Multiply(b));
        System.out.println("a / b is " + a.Divide(b));
    }
}
