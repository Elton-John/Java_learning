package java_00_revision;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Shape(1,2,"black");
        Shape shape2 = new Shape(2,6,"white");

       // Circle circle1 = new Circle(5,6,"rose");

        String distance = shape1.getDistance(shape2);
        System.out.println(distance);
      //  System.out.println(circle1.sayHello());

       // shape1.getDistance(circle1);
    }
}
