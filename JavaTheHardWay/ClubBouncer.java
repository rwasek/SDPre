public class ClubBouncer {
  public static void main( String[] args ) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
      System.out.println("You are allowed to enter the club.");
    }
//    System.out.println("testing some words"); this will not work
    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}

/* The code does not compile if I throw a println() statement into line 11,
   this is because by doing so I am breaking up the combination of the if/else
   statement.  Else must follow the next closed line block of code right after an if statement
   to compile correctly. */
