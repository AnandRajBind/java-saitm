class Throw_Throwes {
public static double area(int r){
double result =Math.PI*r*r;
return result;
}

    public static int divide(int a, int b) throws ArithmeticException {
        // made by harry
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Shivam- uses divide function created by harry
        try {
            int c = divide(6, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
