import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RectangleTest {

    public static void main(String[] args) {
        Shape.setScreenSize(9);
        StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());

        List<Rectangle> rectangleList = new ArrayList<Rectangle>();
        for (int i = -5; i < 5; i++) {
            rectangleList.add(new Rectangle(i, 2*i, Math.abs(i), 2*Math.abs(i)));
        }
        Collections.sort(rectangleList);

        for (int i = 0; i < rectangleList.size(); i++) {
            rectangleList.get(i).customizedColor(ColorScheme.GRAY, i);
            System.out.println(rectangleList.get(i));
        }
    }
}
