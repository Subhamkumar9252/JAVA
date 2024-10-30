import java.time.chrono.MinguoDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Selfpractice {
    public static void main(String[] args) {
int [] arr= {22, 4, 56, 77, 99, 34};
bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
static void bubble(int[] arr){
   for (int i = 0; i < arr.length -1; i++){
       for ( int j = 1; j < arr.length -1; j++){
           if(arr[j] < arr[j-1]){
               int temp = arr[i];
               arr[i] = arr[j-1];
               arr[j-1] = temp;
           }
       }
   }
}

}

