import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class P11_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("babynames.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter boys = new PrintWriter("boynames.txt");
        PrintWriter girls = new PrintWriter("girlnames.txt");
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] str = line.split("  ");
            int times = Integer.parseInt(str[0]);
            boys.printf("%d  %s  %s  %s\n", times, str[1], str[2], str[3]);
            girls.printf("%d  %s  %s  %s\n", times, str[4], str[5], str[6]);
        }
        in.close();
        boys.close();
        girls.close();
    }
}
