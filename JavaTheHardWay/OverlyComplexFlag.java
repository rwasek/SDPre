import static java.lang.System.*;

public class OverlyComplexFlag {
  public static void main(String[] args) {
      printTopHalf();

      print48Colons();
      print48Ohs();
      print48Colons();
      print48Ohs();
      print48Colons();
      print48Ohs();
      printPledge();
  }

  public static void print48Colons() {
      out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
  }

  public static void print48Ohs() {
      out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print29Colons() {
      out.println("|:::::::::::::::::::::::::::::|");
  }

  public static void printPledge() { // This never showed up initially because it was never called until I added it to line 13 at the end of "main".
      out.println("I pledge allegiance to the flag.");
  }

  public static void print29Ohs() {
      out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print6Stars() {
      out.print("| *  *  *  *  *  * ");
  }

  public static void print5Stars() {
      out.print("|   *  *  *  *  *  ");
  }

  public static void printSixStarLine() {
      print6Stars();
      print29Ohs();
  }

  public static void printFiveStarLine() {
      print5Stars();
      print29Colons();
  }

  public static void printTopHalf() {
    out.println(" ________________________________________________");
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
  }
}
