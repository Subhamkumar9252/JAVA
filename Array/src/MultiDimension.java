import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int col = sc.nextInt();

    int[][] num = new int[rows][col];

    //input
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < col ; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
