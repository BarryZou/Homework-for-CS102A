
public class Circle extends Shape {
	private double radius;
	static final int DEFAULT_RADIUS = 5;

	public Circle(double radius, double x, double y) {
		super(x, y);
		this.radius = radius;
	}

	public Circle(double radius) {
		super(0, 0);
		this.radius = radius;
	}

	public Circle(double x, double y) {
		super(x, y);
		this.radius = DEFAULT_RADIUS;
	}

	public void checkColor() {
		if(isInBoundary()) {
			super.setColor(ShapeColor.GREEN);
		}else {
			super.setColor(ShapeColor.RED);
		}
	}

	public boolean isInBoundary() {
		if (-1 * Shape.getScreenSize() > this.x - this.radius || Shape.getScreenSize() < this.x + this.radius) {
			return false;
		}
		if (-1 * Shape.getScreenSize() > this.y - this.radius || Shape.getScreenSize() < this.y + this.radius) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("The postion of the circle is (%.2f, %.2f), the radius is %.2f, %s, %s.\n"
		        , this.x, this.y, radius, this.color, this.color.getDesc());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void draw() {
//		StdDraw.setXscale(-screenSize, screenSize);
//		StdDraw.setYscale(-screenSize, screenSize);

		StdDraw.setPenColor(this.color.getColor());
		StdDraw.filledCircle(this.x, this.y, radius);


	}	
}
