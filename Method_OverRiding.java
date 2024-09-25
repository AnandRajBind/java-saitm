
 
class A {

    public int a;

    public int method1() {
        return 4;
    }// in the method ooverloading the method name should be same but the parameter should be different.
// method overloading is possible in the same class and inherited class. while method over riding is not possible in the same class.
// in method over riding both method return type , access modifier  and parameter should be same  must be.
// final  method are not overriden.
    public void method2() {   // In the method over riding the method name and parameter should be same as the base class method name.
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {

    @Override  // here override notation is used to override the base class method to derived class method.it is optional to use the override notation.
    public void method2() {
        System.out.println("I am method 2 of class B");// override the base class method to derived class method 
    }
    public void method3() {
        System.out.println("I am method 3 of class B");
    }
}

public class Method_OverRiding {
    public static void main(String[] args) {
A obj=new A();
B obj2=new B();
 obj2.method2();    
obj2.method3();    
    }
}
