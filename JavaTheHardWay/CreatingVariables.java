public class CreatingVariables {
  public static void main ( String[] args ) {
    int x, y, age, heightininches;
    double seconds, e, checking, weightinlbs;
    String firstName, lastName, title, heightinfo, weightinfo;

    x = 10;
    y = 400;
    age = 39;
    heightininches = 68;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    weightinlbs = 130.1;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    heightinfo = "I am this many inches tall: ";
    weightinfo = "I weigh this many pounds: ";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println(heightinfo + heightininches + "." + " Also, " + weightinfo + weightinlbs);
  }
}
