import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double bmi, height, weight, m, kg;

    System.out.print( "Enter your height in inches: " );
    height = keyboard.nextDouble();

    System.out.print( "Enter your weight in lbs: " );
    weight = keyboard.nextDouble();

    m = height*0.0254;
    kg = weight/2.205;
    bmi = kg / (m*m);

    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    if ( bmi < 25.0 ) { // Yes, this is breaking the flow.
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
/* Changing the "else if" from Line 28 into "if" gives you two separate if statement chains
   and if you have anything less than 18.5 for BMI, both will print out since they
   are both technically true at that point. The new "if" does not care about the prior
   if/else statements. So even if you are 7'2" and 80 lbs you will be told you are very severely
   underweight and normal weight at the same time which is broken. */
