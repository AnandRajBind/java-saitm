package calc;


class calculator{
    public void calculator(int a, int b){
System.out.println("Sum of two numbers is: "+(a+b));
    }

}
class ScCalculator{
    public void calculator(int a, int b){
System.out.println("Sum of two numbers is: "+(a+b));
    }
}
class HybridCalculator{
    public void calculator(int a, int b){
System.out.println("Sum of two numbers is: "+(a+b));
    }
}

public class Problem1 {
    public static void main(String args[]){
calculator c = new calculator();
c.calculator(5, 6);

    }
}
