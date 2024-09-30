//Problem 1 and 2  Write a program to create an abstract class named Pen with two abstract methods write() and refill(). Create a class FountainPen that extends Pen class and add a method changeNib() to it.
/* 
abstract class Pen {
    abstract void write();

    abstract void refill();

}

class FountainPen extends Pen {
    public void write() {
        System.out.println("Write");
    }

    public void refill() {
        System.out.println("Refill");
    }

    public void changeNib() {
        System.out.println("Change the nib");
    }
}

public class Abstract_Exercise {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();        
    }
}
*/
// problem 3 Write a program to create a class Monkey with two methods jump() and bite(). Create a class Human that is derived from the Monkey class. and implements the basicAnimal interface.

/* 
interface BasicAnimal {
    void eat();

    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("Jumping");
    }

    void bite() {
        System.out.println("Biting monkey");
    }
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class Abstract_Exercise {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.eat();
        obj.sleep();
        obj.jump();
        obj.bite();
//problem 5 demostrate polymorphism using monkey class reference and human object
        Monkey m = new Human();// reference of monkey class and object of human class it is called polymorphism
        m.jump();
        m.bite();

    }
}
*/

// Problem 4.  
/* 
abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelePhone extends Telephone {
    public void ring() {
        System.out.println("Ringing");
    }

    public void lift() {
System.out.println("Lifting the call");
    }

    public void disconnect() {
System.out.println("Disconnecting the call");
    }

  void takeSnap() {
    System.out.println("Taking a snap");
    }
}

public class Abstract_Exercise {
    public static void main(String[] args) {
Telephone obj=new SmartTelePhone();
obj.ring();
obj.lift();
obj.disconnect();
// obj.takeSnap(); // not allowed

    }
}
*/

// problem 6 and 7 

interface TvRemote {
    void switchOn();
    void switchOff();
}

interface SmartTvRemote extends TvRemote {
    void switchChannel(int channel);
}

class Tv implements TvRemote {
    public void switchOn() {
        System.out.println("Switching on the TV");
    }

    public void switchOff() {
        System.out.println("Switching off the TV");
    }
}

public class Abstract_Exercise {
    public static void main(String[] args) {
        Tv obj = new Tv();
        obj.switchOn();
        obj.switchOff();
    }
}
