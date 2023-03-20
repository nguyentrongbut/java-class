import java.util.Scanner;

public class Person {
    String name;
    String email;
    int age;
    public  void  input() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = Input.nextLine();

        System.out.println("Enter email");
        this.email = Input.nextLine();

        System.out.println("Enter age");
        this.age = Input.nextInt();

    }

    public void display() {
        System.out.println("name is: " + this.name);
        System.out.println("email is: " + this.email);
        System.out.println("age is: " + this.age);
    }
}
