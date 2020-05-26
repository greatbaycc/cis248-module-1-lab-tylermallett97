import java.util.Scanner;

public class PasswordModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        StringBuilder newPassword = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            switch (ch) {
                case 'i':
                    newPassword.append('!');
                    break;
                case 'a':
                    newPassword.append('@');
                    break;
                case 'm':
                    newPassword.append('M');
                    break;
                case 'B':
                    newPassword.append('8');
                    break;
                case 'o':
                    newPassword.append('.');
                    break;
                default:
                    newPassword.append(ch);

            }
        }

        newPassword.append("q*s");
        System.out.println(newPassword);
    }
}