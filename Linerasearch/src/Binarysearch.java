public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={-12, -17, -2, -1, 0, 13, 34, 22, 44, 55, };
        int target = 13;
        int ans = binary_search(arr, target);
        System.out.println(ans);
    }
    static int binary_search(int[] arr, int target){
      int start = 0;
      int end = arr.length -1;
      while (start <= end){
          int mid = start + (end - start) /2;

          if (target < arr[mid]){
              end = mid -1;
          } else if (target > arr[mid]) {
              start = mid + 1;
          }else {
              return mid;
          }
      }
      return -1;
    }
}
