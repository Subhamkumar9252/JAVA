import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
     fun(1,3,4,64,34,67,78);
     demo(3,5,67,2,45);
     demo("dhoni");

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
