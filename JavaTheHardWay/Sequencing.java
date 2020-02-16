import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args ) {


    Scanner keyboard = new Scanner(System.in);
    double price=100, salesTax=100, total=100; // Test of setting initial variables

    System.out.print( "How much is the purchase price? " );
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax );
    System.out.println( "Total cost:\t" + total );

/* 1. When you remove the = 0 on line 8, the code cannot compile because
      the price variable has not been initialized yet and the code runs in
      sequence, also, variables store values not algorithms.
   2. Moving the two lines of code that give values to our double variables
      salesTax and total, after price gets a user prompted value stored,
      then allows the program to run correctly.
   3. Removing the = 0 on line 8 after moving the double variable code lines
      down doesn't give an error.  Not surprising because with or without
      price being initialized at 0, the user is prompting input on top of that
      and then salesTax and total can run afterwards without a problem since
      a user gives it a new value other than 0 before salesTax and total get
      calculated. Even if I set the value of price intitally to price = 100,
      once the user enters the price into the scanner that seems to get
      overriden with the new stored variable the user entered and the code works
      as normal.
*/
  }
}
