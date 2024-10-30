public class String_Comprisoin {
    public static void main(String[] args) {
    String a = "subham";
    String b = "subham";
    String c = a;
//        System.out.println(a==b);
//        System.out.println(a ==c );
        String name1 = new String("subham");
        String name2 = new String("subham");
//        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
