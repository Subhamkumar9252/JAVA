import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 12;
        arr[3] = 123;
        arr[4] = 122;
       // store like [1, 2, 12, 123, 122]
       // System.out.println(arr[3]);

//        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//       }
           // System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }
//        for(int num : arr) { // for every element in array print the element
//            System.out.println( num + "  ");// here num represent elements of array
//        }
        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
        str[1] ="subham";
        System.out.println(Arrays.toString(str));
    }
}
