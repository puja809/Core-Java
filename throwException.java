import java.util.Scanner;

public class throwException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        try {
            if (j == 0 && i != 0) {
                throw new ArithmeticException("Cannot divide by Zero");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
