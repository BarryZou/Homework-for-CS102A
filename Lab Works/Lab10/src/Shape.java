public class Shape {
    protected double x;
    protected double y;
    protected ShapeColor color = ShapeColor.GRAY;
    private static int screenSize = 10;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
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

    public ShapeColor getColor() {
        return color;
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }

    public static int getScreenSize() {
        return screenSize;
    }

    public static void setScreenSize(int screenSize) {
        Shape.screenSize = screenSize;
    }

    public boolean isInBoundary() {
        if (this instanceof Circle) {
            if (-1 * Shape.getScreenSize() > this.x - ((Circle)this).getRadius() ||
                    Shape.getScreenSize() < this.x + ((Circle)this).getRadius()) {
                return false;
            }
            if (-1 * Shape.getScreenSize() > this.y - ((Circle)this).getRadius() ||
                    Shape.getScreenSize() < this.y + ((Circle)this).getRadius()) {
                return false;
            }
        }
        if (this instanceof Rectangle) {
            if (-1 * Shape.getScreenSize() > this.x - ((Rectangle)this).getWidth() ||
                    Shape.getScreenSize() < this.x + ((Rectangle)this).getWidth()) {
                return false;
            } else if (-1 * Shape.getScreenSize() > this.y - ((Rectangle)this).getHeight() ||
                    Shape.getScreenSize() < this.y + ((Rectangle)this).getHeight()) {
                return false;
            }
        }
        return true;
    }

    public void checkColor() {
        if (isInBoundary()) {
            setColor(ShapeColor.GREEN);
        } else {
            setColor(ShapeColor.RED);
        }
    }

    public void draw() {
        if (this instanceof Circle) {
            StdDraw.setPenColor(this.color.getColor());
            StdDraw.filledCircle(this.x, this.y, ((Circle)this).getRadius());
        } else if (this instanceof Rectangle) {
            StdDraw.setPenColor(this.color.getColor());
            StdDraw.filledRectangle(this.x, this.y, ((Rectangle)this).getWidth() / 2, ((Rectangle)this).getHeight() / 2);
        }
    }

    public String toString() {
        if (this instanceof Circle) {
            return String.format("The postion of the circle is (%.2f, %.2f), the radius is %.2f, %s, %s.\n"
                    , this.x, this.y, ((Circle)this).getRadius(), this.color, this.color.getDesc());
        } else {
            return String.format(
                    "The position of the rectangle is (%.2f, %.2f), the width is %.2f, the height is %.2f, %s, %s.\n",
                    this.x, this.y, ((Rectangle)this).getWidth(), ((Rectangle)this).getHeight(), this.color, this.color.getDesc());
        }
    }
}
