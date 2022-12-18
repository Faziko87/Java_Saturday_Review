package week12_review;

public class Rectangle extends Shape {

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double calc_area() {
        return length*width;
    }

    @Override
    public double calc_perimeter() {
        return 2*(length*width);
    }
}
