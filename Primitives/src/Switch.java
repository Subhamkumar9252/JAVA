import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruits = in.next();
//
//        switch (fruits) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Sweet fruit");
//            case "Grapes" -> System.out.println("Smallest fruit");
//            case "orange" -> System.out.println("Round fruit");
//            default -> System.out.println("please enter valid fruits");
//        }
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
