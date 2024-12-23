import java.util.Scanner;

public class Employe {

    private int empid;
    private float salary;
    private String name;
    private String Address;

    Employe(int empid, float salary, String name, String address) {
        this.empid = empid;
        this.salary = salary;

        this.name = name;
        this.Address = address;

    }

    public void display() {
        System.out.println("Employe id=" + empid);
        System.out.println("Employe Salary=" + salary);
        System.out.println("Employe name=" + name);
        System.out.println("Employe Address=" + Address);

    }

}

class Emp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employe id number=");
        int empid = sc.nextInt();
        System.out.println("Enter the Salary");
        float salary = sc.nextFloat();
        System.out.println("Enter the name=");
        String name = sc.next();
        System.out.println("Enter Employe  Address=");
        String Address = sc.next();

        Employe e = new Employe(empid, salary, name, Address);

        e.display();

    }
}
