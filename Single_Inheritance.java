// Write a  single inheritance java program to demonstrate the use of super keyword in java. 
class Parent {

    void display() {
        System.out.println("This is a parent class");
    }
}
// super keyword is used when parent class and child class have same method name and we want to call the parent class method.
class Child extends Parent {

    void show() {

        super.display();// super keyword is used to calling the parent class method without calling the
                        // parent class method.
        System.out.println("This is a child class");
    }
}

public class Single_Inheritance {

    public static void main(String[] args) {
        Child obj = new Child();// crating object of child class
        obj.show(); // calling the child class method
        // obj.display();
    }
}
