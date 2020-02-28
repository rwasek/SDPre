public class HeronsFormula {
    public static void main(String[] args) {
        double a, g;
        String tws = "A triangle with sides ";

        a = triangleArea(3, 3, 3);
        System.out.println("A triangle with sides 3,3,3 has area " + a);

        a = triangleArea(3, 4, 5);
        System.out.println("A triangle with sides 3,4,5 has area " + a);
        g = triangleArea(7, 8, 9);
        System.out.println(tws + "7,8,9 has area " + g);

        System.out.println(tws + "5,12,13 has area " + triangleArea(5, 12, 13));
        System.out.println(tws + "10,9,11 has area " + triangleArea(10, 9, 11));
        System.out.println(tws + "8,15,17 has area " + triangleArea(8, 15, 17));

        System.out.println(tws + "9,9,9 has area " + triangleArea(9, 9, 9));
    }

    public static double triangleArea(int a, int b, int c) {
        double s, A;

        s = (a+b+c) / 2.0;
        A = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return A;
    }
}
// 1. The version not using functions is way longer, basically 6 lines of code vs 1-2 with utilizing functions.
// 2. Would have been harder if you weren't using functions, instead of fixing the 2 to 2.0 in one line of code
//    you would have to repeat yourself in six different lines of code.
// 3. It was not difficult to add the area of a triangle with sides 9,9,9, it only took one line of code.
//    but if I wasn't using functions it would've required an extra 6 lines of code.
