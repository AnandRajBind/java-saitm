public class Finally_block {
    public static int greet() {
        try {
            int a = 60;
            int b = 0;
            int c = a / b;
            // System.out.println(c);
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is the end of the program");
        }
        return 0;// yadi exception occur hoga tab jaker ye return statement occur hoga otherwise
                 // try block ka return statement return hoga.
    }

    public static void main(String[] args) {
        // greet();
        int k = greet();
        System.out.println(k);

        int a = 25;
        int b = 5;

        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally for value b = " + b);
            }
            b--;
        }
        // try block ke sath catch() block must hai. yadi ham catch block nhi lagana
        // chahate hai to finally ka bhi use ker sakte hai.
        try {
            System.out.println(50 / 10);
        } finally {
            System.out.println("This is finally ");
        }
    }
}
