// write a program to show multiple inheritance in java using interface.
interface Grandfather {

    void grandfathersMethod();// abstract method. abstract method does not have a body.
}

interface Father {
    void fathersMethod();
}

class Child implements Grandfather, Father {

    public void grandfathersMethod() { // implementing abstract method of Grandfather interface
        System.out.println("Good Morning Dada G");
    }

    public void fathersMethod() {// implementing abstract method of Father interface
        System.out.println("Good Morning Papa");
    }
}

interface MutipleInheritance {

    public static void main(String[] args) {
        Child obj = new Child();// creating object of child class
        obj.grandfathersMethod();// calling the child class method
        obj.fathersMethod();
    }
//
}
