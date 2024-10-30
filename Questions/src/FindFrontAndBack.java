public class FindFrontAndBack {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans= frontBack(arr, target);
        System.out.println(ans);
    }
    static int frontBack(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid <= target){
               
            }
        }
       return -1;
    }

}
