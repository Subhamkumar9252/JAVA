import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(671);
        list.add(672);
        list.add(673);

        list.add(67);
        list.add(671);
        list.add(672);
        list.add(673);

        list.add(67);
        list.add(671);
        list.add(672);
        list.add(673);

        list.add(67);
        list.add(671);
        list.add(672);
        list.add(673);
        System.out.println(list.contains(671));
        System.out.println(list);
        list.set(0, 99);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

    }
}
