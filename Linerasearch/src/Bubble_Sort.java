import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
    int[] arr = {3, 1, 5, 4, 2};
    bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        //run the step n time
        for (int i = 0; i < arr.length; i++) {
            //  for each step max no come at the last index
            for (int j = 1; j < arr.length -i ; j++) {
                // swap tje item smaller than previous item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
            
        }

    }
}
