public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 34 , 53, 2, 6};
        int max = max(arr);
        System.out.println(max);
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> maxVal){
                 maxVal = arr[i];
            }
            
        }
        return maxVal;
    }

}
