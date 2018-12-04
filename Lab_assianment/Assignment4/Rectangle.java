import java.awt.*;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    final double DEFAULT_WIDTH = 1.0;
    final double DEFAULT_HEIGHT = 1.0;
    final Color DEFAULT_COLOR = new Color(100, 100, 100);

    Rectangle(double x, double y, double width, double height, int red, int green, int blue) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        if (red > 255 || red < 0) {
            if (red > 0) {
                red = 255;
            } else red = 0;
        }
        if (green > 255 || green < 0) {
            if (green > 0) {
                green = 255;
            } else green = 0;
        }
        if (blue > 255 || blue < 0) {
            if (blue > 0) {
                blue = 255;
            } else blue = 0;
        }
        this.color = new Color(red, green, blue);
    }

    Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = DEFAULT_COLOR;
    }

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
        this.color = DEFAULT_COLOR;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return String.format("Centre[%.1f,%.1f] Shape[%.1f,%.1f] Color[%d,%d,%d]",
                this.x, this.y,
                this.width, this.height,
                this.color.getRed(), this.color.getGreen(), this.color.getBlue());
    }

    public boolean intersect(Rectangle r) {
        double disx = Math.abs(this.x - r.x);
        double disy = Math.abs(this.y - r.y);
        double minX = (this.width + r.width) / 2;
        double minY = (this.height + r.height) / 2;
        return (disx < minX && disy < minY);
    }

    public static boolean intersect(Rectangle r1, Rectangle r2) {
        return (r1.intersect(r2));
    }

    public boolean isValid() {
        return (this.width <= 5 && this.width >= 0 && this.height <= 5 && this.height >= 0
                && this.x > -10 && this.x < 10 && this.y > -10 && this.y < 10);
    }

    public boolean isInBoundary() {
        boolean blx = this.x > (-10 + this.width / 2) && this.x < (10 - this.width / 2);
        boolean bly = this.y > (-10 + this.height / 2) && this.y < (10 - this.height / 2 );
        return (blx && bly);
    }

    public void draw() {
        StdDraw.setPenColor(this.color);
        StdDraw.filledRectangle(this.x, this.y, this.width/2, this.height/2);

    }
}
