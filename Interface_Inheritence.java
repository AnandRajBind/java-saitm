interface printable {// interface 1
    void print();
}

interface showable extends printable { // inherit interface 1
   abstract void show();
}

public class Interface_Inheritence implements showable { // inherit interface 2


    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }


    public static void main(String[] args) {
        Interface_Inheritence obj=new Interface_Inheritence();

        obj.print();
        obj.show();
    
    }
}
