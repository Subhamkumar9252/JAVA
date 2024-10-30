import java.lang.reflect.Array;
import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        //create an array
        int[] arr = { 1, 2, 3, 45, 9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void change(int[] numm){
        numm[3] = 98;
     }
}
