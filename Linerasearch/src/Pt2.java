import java.util.Arrays;

public class Pt2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1,0};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        short0and1(arr);
//        System.out.println(Arrays.toString(arr));
        shortevenandodd(arr2);
        System.out.println(Arrays.toString(arr2));
        short2(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void shortevenandodd(int[] arr){
        int n = arr.length;
        int left =0;
        int right =n-1;
        while(left<right){
            if(arr[left]%2!=0&&arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }
    static void short2(int [] arr){
        int n = arr.length;
        int left =0;
        int right = n-1;
        while (left<right){
            if(arr[left]==1&&arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

    }
//    static void short0and1(int[] arr){
//        int zeros =0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==0){
//                zeros++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(i < zeros){
//                arr[i]=0;
//            }
//            else {
//                arr[i]=1;
//            }
//        }
//    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

