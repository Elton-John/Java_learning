package java_00_revision;
public class Shape{
    private int x;
    private int y;
    private String color;

    public Shape (int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;

    }

    public String getColor(){
        return color;
    }

    public String getDistance (Shape shape){
        int distanceX = shape.getX() - x;
        int distanceY = shape.getY() - y;
        return distanceX + " , " + distanceY;
    }

    public String getDescription(){
        return this.getClass() + " " + color;
    }


//zamyka shape
}
class Circle extends Shape {

    private double radius;

    public Circle(int x, int y, String color, double radius){
        super(x, y, color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

//zamyka circle
}
