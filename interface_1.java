
interface  printable{
  abstract   void print();  // by default abstract. abstract keyword is optional.
}

class A6 implements printable{
    public void print(){
        System.out.println("Hello");
    }
}
public class interface_1 {
    public static void main(String[] args) {
        // Interface is a reference type in Java
        // It is similar to class. It is a collection of abstract methods.
        // A class implements an interface, thereby inheriting the abstract methods of the interface.
        // Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types.

        // Interfaces cannot have constructors
        // All methods in an interface are public and abstract by default
        // An interface can extend multiple interfaces
        // An interface cannot implement another interface

A6 obj = new A6();
obj.print();

}
}