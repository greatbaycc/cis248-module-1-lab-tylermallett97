import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int smallestInt = Integer.MAX_VALUE;
        for (int i = 1; i <= 3; i++) {
            int x = scan.nextInt();
            if (x < smallestInt){
                smallestInt = x;
            }
        }
        System.out.println(smallestInt);
    }
}
