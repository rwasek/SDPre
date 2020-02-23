public class ThereAndBackAgain {
  public static void main(String[] args) {
    System.out.println("Here.");
    erebor(); // removing the () from this gives you a compilier error saying erebor is not a statement
    System.out.println("Back first time.");
  //  erebor(); commenting this out made sense, "There." obviously wasn't printed again and it skipped to the final line
    System.out.println("Back second time.");
  }

  public static void erebor() {
    System.out.println("There.");
  }
}
