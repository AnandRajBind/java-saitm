//Here is declare the  custom exception (NegativeRadiusException) by exception class and  override the toString() and getMessage() Exception class method.
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative ";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}


// example-1 implement the throwes keyword in the function signature
class Throw_Throws {
      // throws keyword ka use function signature me karte hai. kisi bhi exception ko skip karne ke liye. yani ki ham kisi bhi exception ko handle nahi karenge.lekin bata denge ki hamare ish method me exception a sakta hai. ishe aap handle ker lena .
    public static double area(int r) throws NegativeRadiusException {

        if (r<0) {
                 throw new NegativeRadiusException();// throw keyword ka use custome exception ko throw karne ke liye karte hai. jaha bhi ham throw keyword ka use karte hai wahi se hamare program ka control ush line se niche wale code me nahi jata.aur  control catch block me chala jata hai.aur agar catch block se niche koi code hai to wo execute nahi hota hai.
        }
           
        double result = Math.PI * r * r;
        return result;
    }
//example-2 implement the throwes keyword in the function signature

    public static int divide(int a, int b) throws ArithmeticException {
        // made by harry
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Shivam- uses divide function created by harry
        try {
            int c = divide(6, 2);
            System.out.println(c);
            // area parameter pass
            double arr=area(-20);
            System.out.println("Radius area is:" + arr);
        } catch ( NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
