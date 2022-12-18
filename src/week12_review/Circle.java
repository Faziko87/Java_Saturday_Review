package week12_review;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape {

    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calc_area() {
        return pow(radius, 2) * PI;
    }

    @Override
    public double calc_perimeter() {
        return radius * 2 * PI;
    }
}
