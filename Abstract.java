// abstract class ake standerd hai jiska use karke ham new class banate hai. abstract class me abstract method hota hai jise child class ko implement karna padta hai.
// Note. ***********************Multiple abstract  class ka use karke ake dushri class nhi bana sakate hai while multiple interface ka use karke ake dushri interface bana sakate hai jise ham log multiple inheritance kahate hai *******************************************

abstract class Parent {
    Parent() {
        System.out.println("I am  Base class Constructor ");
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    abstract public void greet1();
    abstract public void greet2();
}
 
// absract class me abstract method hota hai jise child class ko implement karna
// padta hai.
class Child extends Parent {
    public void greet1() {
        System.out.println("Good Morning");
    }
    public void greet2() {
        System.out.println("Good After Noon ");
    }
}

// abstract class ko yadi ham inherit karte hai to us class me jo method hai
// usko must hota hai derived class me implement karna yadi ham aisa nhi karte
// hai to derived class ko bhi abstract karna padega.
// abstract class ko inherit karke ake dushri abstract class banai hai.
abstract class Child2 extends Parent {
    public void meth() {
        System.out.println("Good Evening");
    }
}

public class Abstract {
    public static void main(String[] args) {

        // Parent p=new Parent() ;// Abstract class does not have object
        // Child2 obj = new Child2();
        Child obj = new Child(); // Derived class object
        obj.greet1();
        obj.greet2();
    }
}
