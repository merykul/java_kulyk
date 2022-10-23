package lesson7;

public class Circle extends Shape {
    private double pi = 3.14;
    private double r;

    public Circle (double r) {
        super();
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * r * pi;
    }

    @Override
    public double getArea() {
        return pi * r * r;
    }
    @Override
    public String dataAboutShape () {
        return "Perimeter of circle is: " + this.getPerimeter() + " and area of circle is: " + this.getArea();
    }
}