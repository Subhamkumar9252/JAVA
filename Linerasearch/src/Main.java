public class Main{
public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 678, 90, 23};
        int target = 3;
        int ans = linearsearch(num, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int targte) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == targte) {
                return index;
            }
        }
        return -1;
    }

}

