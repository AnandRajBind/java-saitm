class Employee {
    String name;
    int salary;

    public String getName() {
        return name;

    }

    public int getSalary() {
        return salary;

    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int num) {
        salary = num;
    }

}
// problem 2
class Square {
    int side;
    public int area() {
        return side * side;
    }
    public int perimeter() {
        return 4 * side;
    }
}


public class getter_setter {

    public static void main(String name[]) {
        Employee emp = new Employee();
        emp.setName("Anand Raj Bind");
        // emp.salary = 344;
        emp.setSalary(344);
        String nam = emp.getName();
        System.out.println(nam);// method first

        System.out.println(emp.getName());// method second
        System.out.println(emp.getSalary());

        // problem 2
Square sq=new Square();
sq.side = 4;
System.out.println(sq.area());
System.out.println(sq.perimeter());

    }
}
