package java_19_abstractClass;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
        calculateArea();
        calculateCircuit();
    }

    @Override
     void calculateArea() {
        area =  Math.pow(side, 2);
    }

    @Override
     void calculateCircuit() {
        circuit = side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", circuit=" + circuit +
                '}';
    }
}
