import java.awt.*;

public class Rectangle extends Shape implements Comparable<Rectangle>, ColorDraw {
	private double width;
	private double height;

	public Rectangle(double x, double y) {
		super(x, y);

	}

	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;

	}
	@Override
	public boolean isInBoundary() {
		if (-1 * Shape.getScreenSize() > this.x - this.width / 2 || Shape.getScreenSize() < this.x + this.width / 2) {
			return false;
		}
		if (-1 * Shape.getScreenSize() > this.y - this.height / 2 || Shape.getScreenSize() < this.y + this.height / 2) {
			return false;
		}
		return true;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int compareTo(Rectangle r) {
	    if (this.width*this.height < r.width*r.height) {
	        return 1;
        } else if (this.width*this.height > r.width*r.height) {
	        return -1;
        } else if (this.x < r.x) {
	        return -1;
        } else if (this.x > r.x) {
	        return 1;
        }
        return 0;
    }

    public void customizedColor(ColorScheme colorScheme, int index) {
        Color[] colorList = colorScheme.getColorScheme();
        if (index < 0) {
            index = 0;
        }
        if (index >= colorList.length) {
            index = index % colorList.length;
        }
        StdDraw.setPenColor(colorList[index]);
        StdDraw.filledRectangle(x, y, width/2, height/2);
    }
	@Override
	public String toString() {
		return String.format(
				"The postion of the rectangle is (%.2f, %.2f), the width is %.2f, the height is %.2f, %s, %s.\n", x, y,
				width, height, color, color.getDesc());
	}

	public void draw() {
		StdDraw.setPenColor(color.getColor());
		StdDraw.filledRectangle(x, y, this.width / 2, this.height / 2);
	}

}
