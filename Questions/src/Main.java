//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr ={1 , 3, 45, 55, 60, 88, 99};
        int target =60;
        int ans = find(arr, target);
        System.out.println(ans);
   }
   static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int  mid = start + (end - start)/2 ;
            if ( target <= arr[mid]){
                end = mid -1;
            }
            if (target >= arr[mid]){
                start = mid+1;
            }
            else {
                return mid+1;
            }
        }
        return start;
   }
}