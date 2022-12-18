package week12_review;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
public class Cylinder extends Shape{

    private double height,radius;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        setHeight(height);
       setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calc_area() {
        return 2*PI*radius*height + (2*PI*radius*radius) ;
    }

    @Override
    public double calc_perimeter() {
        return (2*radius) + (2*height);
    }


}
