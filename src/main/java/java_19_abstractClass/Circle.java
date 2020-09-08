package java_19_abstractClass;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculateCircuit();
    }

    @Override
    void calculateArea() {
        area = Math.round(Math.PI) * Math.pow(radius,2);

    }

    @Override
    void calculateCircuit() {
        circuit = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", circuit=" + circuit +
                '}';
    }
}
