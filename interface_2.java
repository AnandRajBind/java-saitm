interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

public class interface_2 {
    public static void main(String args[]) {
//Syntax:-  interfaceName objectName= new className();
        Drawable d = new Circle(); // creating a object through the  interface.
        d.draw();
        Drawable d1 = new Rectangle();
        d1.draw();

Rectangle r = new Rectangle();
Circle c = new Circle();
r.draw();
c.draw();
}
}
