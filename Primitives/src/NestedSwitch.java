import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Subham kumar");
//                break;
//            case 2:
//                System.out.println("Swapnil");
//                break;
//            case 3:
//                System.out.println("Himanshu");
//                break;
//            case 4:
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Department":
//                        System.out.println("Development department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//                break;
//            default:
//                System.out.println("enter correct empID");
//                break;
//        }
//    }

        switch (empID) {
            case 1 -> System.out.println("Subham kumar");
            case 2 -> System.out.println("Swapnil");
            case 3 -> System.out.println("Himanshu");
            case 4 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Department" -> System.out.println("Development department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("enter correct empID");
        }
    }
}
