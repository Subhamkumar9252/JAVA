import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        boolean ans = isprime(n);
//        System.out.println(ans);
        System.out.println(isArmstrong(n));
    }
    // print all 3 digit armstrong number
static boolean isArmstrong(int n){
         int original = n;
         int sum = 0;

         while (n > 0){
             int rem = n % 10;
             sum = sum + rem*rem*rem;
         }
         if (sum == original){
             return true;
         }
         return false;
}
    static boolean isprime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
   while (c * c <= n){
       if (n % c == 0){
           return false;
       }
       c++;
   }
   return  c * c > n;
    }
}
