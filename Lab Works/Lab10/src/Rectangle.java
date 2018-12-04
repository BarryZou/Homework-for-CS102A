
public class Rectangle extends Shape {
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

	public void checkColor() {
		if (isInBoundary()) {
			super.setColor(ShapeColor.GREEN);
		} else {
			super.setColor(ShapeColor.RED);
		}
	}

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

	public String toString() {
		return String.format(
				"The position of the rectangle is (%.2f, %.2f), the width is %.2f, the height is %.2f, %s, %s.\n",
				this.x, this.y, width, height, this.color, this.color.getDesc());
	}

	public void draw() {
		StdDraw.setPenColor(this.color.getColor());
		StdDraw.filledRectangle(this.x, this.y, this.width / 2, this.height / 2);
	}

}
