import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
       /*
       syntax for looop

       for (initialisation; condition; increment/decrement){
       //body

        */
        // Q print no 1 to 5?
//        for (int num=1; num <=5; num += 1){
//            System.out.println(num);
//        }
         // print no 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1; num <= n ; num++) {
//            System.out.println(num + " ");
//        }
        //while loop
        /*
        syntax:
          while (condition){
          //body
          }
         */
        // Q print no 1 to 5?
//        for (int num=1; num <=5; num += 1){
//            System.out.println(num);
//        }
        int num = 1;
        while (num <= 5){
//            System.out.println(num);
            num += 1;
        }
//        do while
        /*
        do {
            while(condition)
            }
         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while (n <= 5);
    }
}
