package chapter2exercises;

import java.util.Scanner;

public class B9_Months {
    public static void showMonthByNumber() {
        System.out.println("Програма виводить назву місяця по його номеру.");
        Scanner scanner = new Scanner(System.in);
        int numberFromUser;

        do {
            System.out.println("Введіть номер місяця (від 1 до 12): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ви ввели не число!");
                scanner.next();
            }
            numberFromUser = scanner.nextInt();
        } while (numberFromUser < 1 || numberFromUser > 12);


        switch (numberFromUser) {
            case 1 -> System.out.println("Січень.");
            case 2 -> System.out.println("Лютий.");
            case 3 -> System.out.println("Березень.");
            case 4 -> System.out.println("Квітень.");
            case 5 -> System.out.println("Травень.");
            case 6 -> System.out.println("Червень.");
            case 7 -> System.out.println("Липень.");
            case 8 -> System.out.println("Серпень.");
            case 9 -> System.out.println("Вересень.");
            case 10 -> System.out.println("Жовтень.");
            case 11 -> System.out.println("Листопад.");
            case 12 -> System.out.println("Грудень");
        }
    }
}
