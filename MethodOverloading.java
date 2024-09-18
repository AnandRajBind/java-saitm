
public class MethodOverloading {
// method overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different. It is similar to constructor overloading in Java, that allows a class to have more than one constructor having different argument lists.

    static void foo() {
        System.out.println("Good Morning");
    }

    static void foo(int a) {
        System.out.println("Good Morning " + a + " Times Bro");

    }

    static void foo(int a, int b) {
        System.out.println("Good Morning " + a +" & "+b+ " Times Bro");

    }
//************************************************************************************************************************** */

    static void change(int a) {
        a = 10; // changing the value of a
    }

    static void change2(int arr[]) {
        arr[0] = 100; // changing the value of a
    }

    static void tellJoke() {
        System.out.println("I told you a joke");
    }

    public static void main(String[] args) {
        // tellJoke();

        //Case:1  changing the integer.
        /* int x = 5;
        change(x);
        System.out.println("Value of x after running change is " + x); */
        //Case:2 changing the integer.
        int marks[] = {10, 20, 30, 40, 50};
        change2(marks);
        System.out.println("Value of x  after running change2 is " + marks[0]);

        // *************************************************************************************************
        //same  methods are called with different number of arguments
        foo();
        foo(10);
        foo(100, 200);// Argument are Actual
    }
}
