// package com.company;
class Employee { // privte variable only method (getter setter) ka use karte hi access kiya ja
                 // sakta hai.
    private int id;
    private String name;

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

public class PrivateAccessModifier {
    public static void main(String[] args) {
        Employee obj = new Employee();
        /*
         * obj.id = 44;
         * obj.name = "Anand";
         */ // it is not accessible. Throws an error due to private access modifier.

        obj.setId(44);
        obj.setName("Anand");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}
