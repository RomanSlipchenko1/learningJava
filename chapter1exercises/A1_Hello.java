package chapter1exercises;
// Привітати користувача при вводі його імені в кс

import java.util.Scanner;

public class A1_Hello {

    public static void Hello() {
        System.out.println("Введіть своє ім'я та натисніть Enter:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Вітаю тебе, " + input);
    }
}
