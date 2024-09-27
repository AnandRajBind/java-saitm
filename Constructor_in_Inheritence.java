
// multilevel inheritance
class Base {
    public Base() {
        System.out.println("Base class constructor");
    }
    // overloaded constructor
    public Base(int x) {
        System.out.println("I am a overloaded constructor of base class with value of x is: " + x);
    }
}
class Derived extends Base {
    public Derived() {
        // Here super keyword is used to call the constructor of the parent class.
        // super();
        // super(5);
        System.out.println("Derived class constructor");
    }
    public Derived(int x, int y) {
        super(x);
        System.out.println("I am overloaded constructor of derived class with value of y is: " + y);
    }
}
// multilevel inheritance
class ChildOfDerived extends Derived {
    public ChildOfDerived() {
        System.out.println("I am Child of Derived class constructor");
    }
    public ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am overloaded constructor  Child of Derived class with value of z is: " + z);
    }
}
public class Constructor_in_Inheritence {
    public static void main(String[] args) {
        // Base obj=new Base();
        // Derived obj1 = new Derived(10, 20);
        ChildOfDerived obj1 = new ChildOfDerived();
     //   ChildOfDerived obj1 = new ChildOfDerived(10, 20,30);
    }
}
