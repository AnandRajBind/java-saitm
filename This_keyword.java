class EkClass {
    int a;

    EkClass(int a) { // constructor of the class
        this.a = a;// this is a keyword which is used to refer to the current object

        System.out.println("I am base class  constructor");
    }

    public int getA() {
        return a;
    }

    public int returnOne() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c);

        System.out.println("I am derived class constructor");
    }

}

class This_keyword {
    public static void main(String[] args) {
        // EkClass obj = new EkClass(5);
        // System.out.println(obj.returnOne());
        // System.out.println(obj.getA());
        DoClass obj1 = new DoClass(6);
    }
}
