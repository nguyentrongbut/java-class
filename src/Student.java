import java.util.Scanner;

public class Student {
    String id;
    String name;
    int age;
    public  void  input() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter id");
        this.id = Input.nextLine();

        System.out.println("Enter name");
        this.name = Input.nextLine();

        System.out.println("Enter age");
        this.age = Input.nextInt();
    }

    public void display() {
        System.out.println("ID is: " + this.id);
        System.out.println("Name is: " + this.name);
        System.out.println("Age is: " + this.age);
    }
}
