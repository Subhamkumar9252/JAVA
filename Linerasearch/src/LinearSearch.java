public class    LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1, 22, 3, 45, 5, 6, 7,};
        int target = 45;
        int ans = linearSeach(arr, target);
        System.out.println(ans);
    }

    static int linearSeach(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return 0;
    }
}

