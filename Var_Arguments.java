class Var_Arguments {

    static int sum(int... arr) {
        // Availble as int []arr
        int result = 0;
        for (int i : arr) {  //foreach loop valu per travers karta but for loop index per traverse karta hai.
result=result+i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 4 is: " + sum(4));
        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 4, 5 and 10 is: " + sum(4,5, 10));
        System.out.println("The sum of 4 5,10 ,20 is: " + sum(4,5, 10, 20));

    }
}