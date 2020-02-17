import java.util.Scanner;

public class AgeMessages {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if ( age < 13 ) {
      System.out.println( "\ttoo young to create a Facebook account" );
    }
    if ( age > 13 ) {
      System.out.println( "\told enough to create a Facebook account" );
    }
    if ( age < 16 ) {
      System.out.println( "\ttoo young to get a driver's license" );
    }
    if ( age > 16 ) {
      System.out.println( "\told enough to get a driver's license" );
    }
    if ( age < 18 ) {
      System.out.println( "\ttoo young to get a tattoo" );
    }
    if ( age > 18 ) {
      System.out.println( "\told enough to get a tattoo" );
    }
    if ( age < 21 ) {
      System.out.println( "\ttoo young to drink alcohol" );
    }
    if ( age > 21 ) {
      System.out.println( "\told enough to drink alcohol" );
    }
    if ( age < 35 ) {
      System.out.println( "\ttoo young to run for President of the U.S." );
      System.out.println( "\t\t(How sad!)" );
    }
    if ( age > 35 ) {
      System.out.println( "\told enough to run for President of the U.S." );
      System.out.println( "\t\t(How exciting!)" );
    }
    if (!( age < 65 )) { // Playing with logical negation to get the same result!
      System.out.println( "\tYou are old enough to retire!" );
    }
    if ( age < 65 ) {
      System.out.println( "\tYou are too young to retire, get back to work!" );
    }
  }
}

/* 1. If you type an age greater than 35, "You are: " is all that gets printed
      because that line of code will always get printed since it comes before
      any conditionals, the rest of the if statements were false, so they were all
      skipped. */
