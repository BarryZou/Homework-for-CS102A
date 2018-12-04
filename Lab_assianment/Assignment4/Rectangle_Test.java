import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle_Test {

    //This is my inner test for class Rectangle

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
        while (in.hasNextLine()) {
            String temp1 = in.nextLine().trim();
            if (!temp1.equals("")) {
                str.add(temp1);
            } else break;
        }
        for (int i = 0; i < str.size(); i++) {
            String[] line = str.get(i).split(",");
            if (line.length == 2) {
                rec.add(new Rectangle(Double.parseDouble(line[0]), Double.parseDouble(line[1])));
            } else if (line.length == 4) {
                rec.add(new Rectangle(Double.parseDouble(line[0]), Double.parseDouble(line[1]),
                        Double.parseDouble(line[2]), Double.parseDouble(line[3])));
            } else if (line.length == 7) {
                rec.add(new Rectangle(Double.parseDouble(line[0]), Double.parseDouble(line[1]),
                        Double.parseDouble(line[2]), Double.parseDouble(line[3]),
                        Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6])));
            }
        }

        for (int i = 0; i < rec.size(); i++) { //isValid
            if (!rec.get(i).isValid()) {
                rec.remove(i);
                i--;
            }
        }

        for (int i = 1; i < rec.size(); i++) { //intersect with the 1st rectangle
            if (rec.get(0).intersect(rec.get(i))) {
                rec.remove(i);
                i--;
            }
        }
        rec.remove(0);

        //Print
        for (int i = 0; i < rec.size(); i++) {
            System.out.println(rec.get(i));
        }
    }
}
