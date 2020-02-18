public class Objective5Lab1 {
  public static void main(String[] args){
    int month = 6;

    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;

      default:
        System.out.println("That is not a valid month");
        break;
    }
  }
}

/* Since month was initialized at 6, and the Lab didn't ask to add a scanner
   to change what was stored in that int variable, I didn't bother to go 12 months
   since it would always print June anyway. */
