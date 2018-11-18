import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class P11_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("babynames.txt");
        PrintWriter sameNames = new PrintWriter("samename.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList<String> boys = new ArrayList<String>();
        ArrayList<String> girls = new ArrayList<String>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] str = line.split("  ");
            boys.add(str[1].trim());
            girls.add(str[4].trim());
        }
        in.close();
        Object[] boysname = boys.toArray();
        for (Object e: boysname) {
            if (girls.contains(e)) {
                sameNames.println(e);
            }
        }
        sameNames.close();
    }
}
