package week12_review;

public class Square extends Shape{

    private double side;


    public Square( double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
