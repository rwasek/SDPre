import java.util.Scanner;

public class Objective3Lab4 {
  public static void main( String[] args ){
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);
    System.out.println("What is your First Name? ");
    firstName = input.next();
    System.out.println("What is your Last Name? ");
    lastName = input.next();
    System.out.println("What is your age? ");
    age = input.nextInt();
    System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ".");



    input.close();
  }
}
