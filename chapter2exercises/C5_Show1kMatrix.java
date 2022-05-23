package chapter2exercises;
// Вивести числа від 1 до k в вигляді матриці N*N:
// - зліва направо
// - зверху вниз

import java.util.Scanner;

public class C5_Show1kMatrix {
    // Заповнення зліва направо
    public static void createMatrixLeftToRight() {
        // Отримати число від користувача
        System.out.println("Метод виводить матрицю від 1 до введеного числа, зліва направо.");
        int k;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть число:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ви ввели не число! Введіть число:");
                scanner.next();
            }
            k = scanner.nextInt();
        } while (k < 2);
        // Зроблю так, щоб матриця завжди була квадратна або наближена до квадратної
        // Розрахувати розмір квадратної матриці так, щоб послідовність завжди в неї влазила
        int n;
        if ((Math.sqrt(k)) % 1 == 0) {
            n = (int) (Math.sqrt(k));
        }else n = (int) (Math.sqrt(k)) + 1;
        // Створити, заповнити і вивести матрицю
        int[][] matrix = new int[n][n];
        int start = 1;
        out:
        for (int line = 0; line < matrix.length; line++) {
            for (int element = 0; element < matrix[line].length; element++) {
                matrix[line][element] = start;
                if (start != k) {
                    // Вирівнює довжину рядків матриці для чисел до 99
                    if (start < 10) {
                        System.out.print(start + "  ");
                    } else System.out.print(start + " ");
                } else {
                    System.out.print(start + " ");
                    break out;
                }
                start++;
            }
            System.out.println();
        }
    }

    // Заповнення зверху вниз по стовпчикам
    public static void createMatrixUpToDown() {
        // Отримати число від користувача
        System.out.println("Метод виводить матрицю від 1 до введеного числа, зверху вниз.");
        int k;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть число:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ви ввели не число! Введіть число:");
                scanner.next();
            }
            k = scanner.nextInt();
        } while (k < 2);
        // Зроблю так, щоб матриця завжди була квадратна або наближена до квадратної
        // Розрахувати розмір квадратної матриці так, щоб послідовність завжди в неї влазила
        int n;
        if ((Math.sqrt(k)) % 1 == 0) {
            n = (int) (Math.sqrt(k));
        }else n = (int) (Math.sqrt(k)) + 1;
        // Створити, і заповнити матрицю
        int[][] matrix = new int[n][n];
        int start = 1;
        for (int line = 0; line < matrix.length; line++) {
            for (int element = 0; element < matrix[line].length; element++) {
                matrix[element][line] = start;
                start++;
            }
        }

        // Вивести матрицю
        for (int line = 0; line < matrix.length; line++) {
            for (int element = 0; element < matrix.length; element++) {
                if (matrix[line][element] <= k) {
                    System.out.print(matrix[line][element] + " ");
                } else break;
            }
            System.out.println();
        }
    }

}
