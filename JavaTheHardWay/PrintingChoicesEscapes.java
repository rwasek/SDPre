public class PrintingChoicesEscapes {
  public static void main( String[] args ) {
    System.out.println( "Alpha" );
    System.out.print( "Bravo\n" );

    System.out.print( "Charlie\n" );
    System.out.print( "Delta\n" );
    System.out.print("\n");

    System.out.print( "Echo" );
    System.out.print( "Foxtrot" );

    System.out.print( "Golf\n" );
    System.out.print( "Hotel\n" );
    System.out.print( "India\n" );

    System.out.print("\n");
    System.out.print( "This" + " " + "is" + " " + "a" + " test.\n" );
    System.out.print( "I am" + " " + "learning Java the" + " " + "Hard Way!\n");
  }
}
