import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int value = 2 * i + 1;
            System.out.print(value);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
    }
}
