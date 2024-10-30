public class Overloading {
    public static void main(String[] args) {
      fun(45);
      fun("Subham kumar");
      int ans = sum(34,45);
        System.out.println(ans);
    }
    static int sum(int a, int b){
        return a + b;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
