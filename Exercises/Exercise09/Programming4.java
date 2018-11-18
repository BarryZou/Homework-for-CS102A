import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Programming4 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("babynames.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("rankednames.txt");
        ArrayList<String> lines = new ArrayList<String>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            lines.add(line);
        }
        in.close();
        String[] liness = lines.toArray(new String[0]);

        //Get names and ranks
        String[] names = new String[2*liness.length];
        int[] ranks = new int[2*liness.length];
        for (int i = 0; i < liness.length; i++) {
            String[] str = liness[i].split("  ");
            names[2*i] = str[1];
            ranks[2*i] = Integer.parseInt(str[2]);
            names[2*i + 1] = str[4];
            ranks[2*i + 1] = Integer.parseInt(str[5]);
        }

        //Sort
        int[] temps = new int[ranks.length];
        for (int i = 0; i < temps.length; i++) { //Copy the array
            temps[i] = ranks[i];
        }
        int[] index = new int[ranks.length];
        Arrays.sort(temps);
        for (int j = 0; j < temps.length; j++) {
            k: for (int i = 0; i < ranks.length; i++) {
                if (ranks[i] == temps[j]) {
                    index[index.length - j - 1] = i;
                    break k;
                }
            }
        }

        //Output
        for (int i = 0; i < names.length; i++) {
            if (index[i]%2 == 1) {
                out.printf("%d  %s  %d  %s\n", i+1, names[index[i]], ranks[index[i]], "girl");
            } else {
                out.printf("%d  %s  %d  %s\n", i+1, names[index[i]], ranks[index[i]], "boy");
            }
        }
        out.close();
    }
}
