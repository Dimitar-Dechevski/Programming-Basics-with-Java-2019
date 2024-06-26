import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int max = Integer.MIN_VALUE;
        int specific = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            result += number;
            if (number > max) {
                max = number;
                specific = max;
            }
        }

        result = result - specific;

        if (result == specific) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", specific);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(specific - result));
        }

    }
}
