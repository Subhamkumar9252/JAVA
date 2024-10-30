import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        System.out.println("Subham"+ new ArrayList<>());
        System.out.println("Subham"+ new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>(); // add at least single string
        System.out.println(ans);
    }
}
