public class Shadowning {
    static int x = 90; // this will shadow at 8 line 10
    public static void main(String[] args) {
        System.out.println(x); // 90

       // System.out.println(x); //
        int x = 40;
        System.out.println(x); // 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
