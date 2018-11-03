public class Complex_define {
    static class Complex {
        private double re;
        private double im;
        public Complex (double re, double im) {
            this.re = re;
            this.im = im;
        }
        public void setRe(double re) {
            this.re = re;
        }
        public void setIm(double im) {
            this.im = im;
        }
        public double getRe() {
            return this.re;
        }
        public double getIm() {
            return this.im;
        }
        public Complex Add(Complex a) {
            return new Complex (a.re+this.re,a.im+this.im);
        }
        public Complex Subtract(Complex a) {
            return new Complex(a.re-this.re, a.im-this.im);
        }
        public Complex Multi(Complex a) {
            return new Complex(a.re*this.re-a.im*this.im, a.re*this.im+a.im*this.re);
        }
        public boolean equals(Complex a) {
            return(this.re == a.re && this.im == a.im);
        }
        public Complex Divide(Complex a) {
            if(a.equals(new Complex(0,0))) {
                System.out.println("Error!");
                return null;
            } else return new Complex((this.re*a.re+this.im*a.im)/(a.re*a.re+a.im*a.im),
                    (this.im*a.re-this.re*a.im)/(a.re*a.re+a.im*a.im));
        }
        public String toString() {
            return this.re + " + " + this.im + "i";
        }
    }

    //Testing
    public static void main(String[] args) {
        Complex a = new Complex(3,1.5);
        Complex b = new Complex(10,100);
        System.out.println("Complex a is " + a + " , and complex b is " + b);
        System.out.println("a + b is " + a.Add(b));
        System.out.println("a - b is " + a.Subtract(b));
        System.out.println("a * b is " + a.Multi(b));
        System.out.println("a / b is " + a.Divide(b));
    }
}
