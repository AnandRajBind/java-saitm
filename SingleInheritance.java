// Write a  single inheritance java program to demonstrate the use of super keyword in java. 
class Parent {

    void display() {
        System.out.println("This is a parent class");
    }
}

class Child extends Parent {

    void show() {
        
        super.display();// super class is used to calling the parent class method without creating the object of parent class.
        System.out.println("This is a child class");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        Child obj = new Child();//crating object of child class
        obj.show(); // calling the child class method
        // obj.display();
    }
}
