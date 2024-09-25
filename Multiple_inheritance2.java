interface printable {
    void print();
}

interface showable {
    // void show();
    void print();

}

class Multiple_inheritance2 implements printable, showable {
    public void print() {
        System.out.println("Hello");
    }

    // public void show() {
    //     System.out.println("Welcome");
    // }

    public static void main(String args[]) {
        Multiple_inheritance2 obj = new Multiple_inheritance2();
        obj.print();
        // obj.show();
    }
}
