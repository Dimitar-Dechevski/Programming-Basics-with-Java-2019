import java.util.Scanner;

public class VowelsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == 'a') {
                result += 1;
            } else if (symbol == 'e') {
                result += 2;
            } else if (symbol == 'i') {
                result += 3;
            } else if (symbol == 'o') {
                result += 4;
            } else if (symbol == 'u') {
                result += 5;
            }
        }

        System.out.println(result);

    }
}
