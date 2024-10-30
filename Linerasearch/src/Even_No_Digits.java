public class Even_No_Digits {
    public static void main(String[] args) {
    int[] arr = {18, 128, 9 ,1764, 98, 1};
        ;
        System.out.println(findNum(arr));
    }
    static int findNum( int[] nums){
int count = 0;
        for (int num : nums ) {
            if (even(num)){
                count++;
            }

        }
        return count;

    }
    static int digits(int num){
        if ( num < 0){
             num = num *-1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }


    static boolean even(int num){
        int no_of_digits = digits(num);
        return no_of_digits % 2 == 0;
    }


}
