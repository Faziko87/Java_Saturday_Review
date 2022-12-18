package week12_review;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Cube extends Shape{

    public Cube( double length, double width, double height) {
        super("Cube");
       setHeight(height);
        setLength(length);
        setWidth(width);
        this.height = height;
    }

    private double length, width, height;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calc_area() {
        return 0;
    }

    @Override
    public double calc_perimeter() {
        return 0;
    }
}
