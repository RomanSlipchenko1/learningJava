package chapter2exercises;
// Вивести на екран таблицю множення

public class B1_MultiplicationTable {
    public static void showMultiplicationTable() {
        System.out.println("Таблиця множення: ");
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                System.out.println(x + " * " + y + " = " + x * y);
            }
            System.out.println();
        }
    }
}
