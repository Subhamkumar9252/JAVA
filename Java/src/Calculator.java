import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("enter the operator");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/'){
                System.out.println("Enter two number");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                if (op == '/'){
                    ans = num1 / num2;
                }
            }else if ( op == 'X' || op == 'x'){
                break;
            } else{
                System.out.println("Invalid operation");
            }

            System.out.println(ans);
        }
    }
}
