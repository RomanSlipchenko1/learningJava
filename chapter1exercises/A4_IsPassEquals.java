package chapter1exercises;
// Ввести пароль з кс і порівняти його зі зразком

import java.util.Scanner;

public class A4_IsPassEquals {
    private static final String password = "HelloWorld";

    public static void isPasswordCorrect() {
        boolean isCorrect = false;
        Scanner scanner = new Scanner(System.in);

        while (!isCorrect) {
            System.out.println("Введіть пароль та натисніть Enter:");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("Пароль вірний!");
                isCorrect = true;
            } else if (input.equals("Exit")) {
                isCorrect = true;
            } else System.out.println("Невірний пароль! Для виходу введіть \"Exit\"");

        }
    }
}
