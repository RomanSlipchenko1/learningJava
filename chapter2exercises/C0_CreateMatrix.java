package chapter2exercises;
// Отримує від користувача розмірність квадратної матриці - n
// Створює матрицю int[n][n]
// Заповнює матрицю випадковими значеннями від -n до +n

import java.util.Scanner;

public class C0_CreateMatrix {

    public static int[][] createMatrix() {

        // Отримати n від користувача, з перевіркою введених даних
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть розмірність квадратної матриці: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ви ввели не число! Введіть число:");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n < 1);

        // Створити матрицю
        int[][] matrix = new int[n][n];
        // Заповнити матрицю випадковими значеннями від -n до +n
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < matrix[i].length; x++) {
                matrix[i][x] = (int) (Math.random() * ((n * 2) + 1) - n);
            }
        }
        // Повернути матрицю
        return matrix;
    }
}
