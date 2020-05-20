import java.util.Scanner;

public class DivideByX {
    public static void main(String[] args) {
        int userNum = Integer.MAX_VALUE;
        int x = Integer.MAX_VALUE;
        Scanner scnr = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {

            userNum = scnr.nextInt();
            x = scnr.nextInt();
            System.out.print(userNum / x + " ");
        }
    }
}
