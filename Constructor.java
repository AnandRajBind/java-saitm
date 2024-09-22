class Employee { // privte variable only method (getter setter) ka use karte hi access kiya ja
    // sakta hai.
    private int id;
    private String name;

// constructor overloading

// constructor 1
   public  Employee() {  // Constructor same name as class name.it has no return type.it is automatically called when object is created.
        id = 0;
        name = "Your-Name-Here";
    }
    //constructor 2.  parameterized constructor

    public  Employee(String Myname, int Myid) {  // In the constructor overloading we can create multiple constructor with different parameter.
        id = Myid;  
        name = Myname;
    }
    public  Employee(String Myname) {  
        id = 1;  
        name = Myname;
    }


    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int num) {
        id = num;
    }

    public int getId() {
        return id;
    }
}

public class Constructor {
    public static void main(String args[]) {
        Employee obj = new Employee("anand");
        //Employee obj = new Employee();// Constructor 1 is call without any Argument.
        // Employee obj = new Employee("Anand Raj Bind",10);// Constructor 2 is call with Argument.
        // obj.setId(44);
        // obj.setName("Anand");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
}
}
