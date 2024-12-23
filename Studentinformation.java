import java.util.Scanner;

public class Studentinformation {
    private String name;
    private int id;
    private double marks[] = new double[5];

    Studentinformation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of student=");
        this.name = sc.nextLine();
        System.out.println("Enter id of Student=");
        this.id = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Student marks=" + (i + 1));
            marks[i] = sc.nextDouble();
        }

    }

    public void display() {
        System.out.println("Student name=" + name);
        System.out.println("Student id =" + id);
        System.out.println("Student marks=");

        for (int i = 0; i < 5; i++) {
            System.out.println("Student" + (i + 1) + " marks=" + (marks[i]));

        }
    }
}

class Department {
    public static void main(String[] args) {
        Studentinformation s = new Studentinformation();
        s.display();
    }
}
