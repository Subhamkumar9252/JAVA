public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
        // recursion = function calling itself is called recursion

    }
    static void print(int n){
        // base condition
        if ( n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call
        // this is called tail recursion
        //this is called last function call
        print(n + 1);
    }
}
// recursion = function calling itself is called recursion