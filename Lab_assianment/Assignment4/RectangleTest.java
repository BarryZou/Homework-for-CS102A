import java.util.Scanner;
import java.util.ArrayList;


public class RectangleTest {

	public static void main(String[] args) {
		ArrayList<Rectangle> list=new ArrayList<Rectangle>();

		Scanner in = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		while (in.hasNextLine()) {
			String temp1 = in.nextLine().trim();
			if (!temp1.equals("")) {
				str.add(temp1);
			} else break;
		}
		for (int i = 0; i < str.size(); i++) {
			String[] line = str.get(i).split(",");
			if (line.length == 2) {
				list.add(new Rectangle(Double.parseDouble(line[0]), Double.parseDouble(line[1])));
			} else if (line.length == 4) {
				list.add(new Rectangle(Double.parseDouble(line[0]), Double.parseDouble(line[1]),
						Double.parseDouble(line[2]), Double.parseDouble(line[3])));
			} else if (line.length == 7) {
				list.add(new Rectangle(Double.parseDouble(line[0]), Double.parseDouble(line[1]),
						Double.parseDouble(line[2]), Double.parseDouble(line[3]),
						Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6])));
			}
		}
		
		//For the third Test
		for(Rectangle r:list) {
			System.out.println(r.isInBoundary());
		}

		// For the forth Test
		Rectangle first=null;
		for(Rectangle r:list) {
			if(r.isValid()) {
				first=r;
				break;
			}
		}
		for(Rectangle r:list) {
			if(r.intersect(first)) {
				System.out.println(r);
			}
		}
		
		// For the fifth Test
		StdDraw.setXscale(-10,10);
        StdDraw.setYscale(-10,10);
		 
		for(Rectangle r: list) {
			if(r.isValid()) {
				r.draw();
			}
		}
	}

}
