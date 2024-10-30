import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {1,7,4,8};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            }


        }
    }

