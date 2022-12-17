package week12_review;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calc_area();

    public abstract  double calc_perimeter();

    @Override
    public String toString() {
        return "{" +
                "area='" + calc_area() + '\'' +
                ", perimeter='" + calc_perimeter() + '\'' +
                '}';
    }
}
