import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, car;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );

    System.out.print( "Last question, " + name + ". What color is your car? " );
    car = keyboard.next();

    System.out.println( "Ahh, " + name +"... your car is " + car + "?! What a terrible color choice!");
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );


    /* 1. The program does not blow up if I enter an integer value when
          it is expecting a double, because doubles can include
          integers and aren't as limiting. If I entered 100, it would come out
          as 100.0 as a double but it's the same number.
     2.   The program does not blow up if I enter a number when it is
          expecting a String, because a String can include words and numerical
          values.. but it views numbers simply as if they were just text.
     3.   "Some Words" will blow up every question. The first String variable
          will blow up because it is expecting one response. The int and double
          variables will blow up because they are expecting numerical values not
          words. However, I noticed if I entered "Rich 1" it would not break
          because I'm answering the second question before it even asks it on
          the screen. If I type Rich 1 1 1 on the first prompt, the whole
          program will run to completion instantly by the way it was coded --
          taking each prompt all at once, right at the first prompt, which was
          interesting. */

  }
}
