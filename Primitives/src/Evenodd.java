import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        if(num1%2==0){
            System.out.println("even no "+ num1);
        }else {
            System.out.println("odd no "+ num1);
        }
    }

}
