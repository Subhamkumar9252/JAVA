import java.util.Scanner;

public class SumNnumber {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n ; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
        //print the table of n no input by user
        Scanner in = new Scanner(System.in);
        int n=  in.nextInt();


        for (int i = 1; i < 11; i++) {

            System.out.println(n*i);

        }

    }
}