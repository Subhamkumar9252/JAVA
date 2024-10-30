import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // type casting
//        int num = (int) (34.67f);
//        System.out.println(num);

        // Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) (a);
//        byte a = 20;
//        byte b= 40;
//        byte c = 100;
//        int d  = (a * b) / c;
//        System.out.println(d);
//
//        byte b = 50;
//        b = b * 2;

//          int number = 'a';
//        System.out.println(number);

//        int * int = int
//        float * int = float

//        System.out.println( 3 * 6.78);c =
//        System.out.println( 3 * 4 );
         byte b = 42;
         char c = 'a';
         short s = 1024;
         int i = 5000;
         float f = 5.67f;
         double d = 0.1234;
         double result = (f * b ) + (i / c) - (d * s);
         // float + int - double =double
        System.out.println((f * b)+ " " + (i / c)+ "  " +(d * s));
        System.out.println(result);




        

    }
}
