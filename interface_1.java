// interface  1

interface Bycycle {
   public int a = 45; // by default public final

  public   void applyBreak(int decrement); // by default abstract. abstract keyword is optional.

    void speedUp(int increment);
}
// interface  2
interface HornBycycle {
    void blowHorn3kg(); // by default abstract. abstract keyword is optional.

    void blowHorn5kg();
}
// implement interface in one class.
class AvonCycle implements Bycycle, HornBycycle {

   //  public int a = 545; 
    public void BlowHorn() {
        System.out.println("Pee Pee");
    }

    public void applyBreak(int decrement) { // interface ke method ko implement karte time public keyword usekarna must
                                           // hota hai.
 
        System.out.println("Applying Break");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp");
    }

    public void blowHorn3kg() {
        System.out.println("Kabhi khushi kabhi gum");
    }

    public void blowHorn5kg() {
        System.out.println("Main hoon na tera hero tu meri heroine");
    }
}

public class interface_1 {
    public static void main(String[] args) {
        // Interface is a reference type in Java
        // It is similar to class. It is a collection of abstract methods.
        // A class implements an interface, thereby inheriting the abstract methods of
        // the interface.
        // Along with abstract methods, an interface may also contain constants, default
        // methods, static methods, and nested types.

        // Interfaces cannot have constructors
        // All methods in an interface are public and abstract by default
        // An interface can extend multiple interfaces
        // An interface cannot implement another interface

        AvonCycle obj = new AvonCycle();
        obj.BlowHorn();
        obj.applyBreak(2);
        obj.speedUp(1);
        obj.blowHorn3kg();
        obj.blowHorn5kg();
         // You can create properties in interface .
        System.out.println(obj.a);
        //
        // obj.a = 4545; // Error. you can not change the value of a because it is
        // final.
    }
}