import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "subham kumar is a bad person";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('h'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
