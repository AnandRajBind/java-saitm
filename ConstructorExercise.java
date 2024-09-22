class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {

        return radius;
    }

    public void setRadius(int num) {
        radius = num;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int nu) {
        height = nu;
    }

    // problem 2
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    // problem 3
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// second custom class
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {// constructor
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {// constructor
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class ConstructorExercise {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(9, 12); // through set value constructor

        // obj.setHeight(12);
        // obj.setRadius(9);
        System.out.println("Cylender height is: " + obj.getHeight());
        System.out.println("Cylender radius is: " + obj.getRadius());

        // problem 2

        System.out.println("Cylender surface area is: " + obj.surfaceArea());
        // problem 3
        System.out.println("Cylender volume area is: " + obj.volume());
        // problem 4
        Rectangle obj2 = new Rectangle();
        System.out.println("Your Rectangle length is: " + obj2.getLength());
        System.out.println("Your Rectangle Breadth is: " + obj2.getBreadth());
    }
}
