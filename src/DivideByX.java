import java.util.Scanner;

public class DivideByX {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = scnr.nextInt();
        int x = scnr.nextInt();

        userNum = userNum / x;
        System.out.print(userNum + " ");

        userNum = userNum / x;
        System.out.print(userNum + " ");

        userNum = userNum / x;
        System.out.print(userNum);

        System.out.println();
    }
}
