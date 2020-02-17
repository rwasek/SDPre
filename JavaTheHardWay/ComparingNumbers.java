import java.util.Scanner;

public class ComparingNumbers {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print( "Second: " );
    second = keyboard.nextDouble();

    if ( first < second )
      System.out.println( first + " is LESS THAN " + second );

    if ( first <= second )
      System.out.println( first + " is LESS THAN/EQUAL TO " + second );

    if ( first == second )
      System.out.println( first + " is EQUAL TO " + second );

    if ( first >= second )
      System.out.println( first + " is GREATER THAN/EQUAL TO " + second );

    if ( first > second )
      System.out.println( first + " is GREATER THAN " + second );

    if ( first != second ) {
      System.out.println( first + " is NOT EQUAL TO " + second );
      System.out.println( "Hey." );
    }
  }
}

/* 1. The line "Hey" still prints w/o curly braces, even if (first != second) is false and skipped
      because it is technically just an extra line of code that isn't apart of
      the body of the if statement without curly braces
   2. Everything works as expected if I remove the other if statement curly braces
      since their bodies only have one line of code. Keeping curly braces around
      the final if statement with the "Hey." line also works because it is
      incorporating both lines into the body with the curly braces.
*/
