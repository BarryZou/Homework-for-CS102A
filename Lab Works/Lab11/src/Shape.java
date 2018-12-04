
public abstract class Shape {
	protected double x;
	protected double y;
	protected ShapeColor color = ShapeColor.GRAY;
	private static int screenSize = 10;

	public Shape() {
		x = 0;
		y = 0;
	}

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void checkColor() {
		if (isInBoundary()) {
			color = ShapeColor.GREEN;
		} else {
			color = ShapeColor.RED;
		}
	}

	public boolean isInBoundary() {
		if (-1 * Shape.getScreenSize() > this.x || Shape.getScreenSize() < this.x) {
			return false;
		}
		if (-1 * Shape.getScreenSize() > this.y || Shape.getScreenSize() < this.y) {
			return false;
		}
		return true;
	}

	abstract public void draw();

	public String toString() {
		return String.format(
				"The center of the shape is [%.2f, %.2f], \nthe color is %s, means %s.\nCurrent scale is %d * %d",
				this.x, this.y, this.color.name(), this.color.getDesc(), Shape.screenSize);
	}

	public static int getScreenSize() {
		return screenSize;
	}

	public static void setScreenSize(int screenSize) {
		Shape.screenSize = screenSize;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public ShapeColor getShapeColor() {
		return this.color;
	}

	public void setShapeColor(ShapeColor color) {
		this.color = color;
	}
}
