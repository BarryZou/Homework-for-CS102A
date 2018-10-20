public class Ex1_3_35 {
    public static void main(String[] args) {
        //This is the ISBN checksum program
        int n = Integer.parseInt(args[0]);
        String s = String.valueOf(args[0]);

        //Define d[1] to d[9]
        int[] d = new int[11];
        for (int i = 1; i <= 9; i++) {
            d[i] = n % 10;
            n = n / 10;
        }

        //Add up the sum for futuer use
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum = sum + d[i] * (i + 1);
        }

        //Compute j
        int j = 0;
        while ((sum + j)%11 != 0) {
            j++;
        }
        d[10] = j;

        //Output the ISBN number
        System.out.printf("The ISBN number is: %s%d", s, d[10]);
    }
}
