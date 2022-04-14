package chapter2exercises;
// Знайти число, в якому мінімальна кількість різних цифр

import java.util.Arrays;

public class A4_MinimunDiffDigits {

    // Метод, який повертає кількість різних цифр числа
    public static int amountOfDiffDigits(int input) {
        int[] ints = new int[10];
        Arrays.fill(ints, 0);
        input = Math.abs(input);
        while (input > 0) {
            input /= 10;
            ints[input % 10] = 1;
        }
        int result = 0;
        for (int i: ints) {
            result += i;
        }
        return result;
    }

    // Знайти і вивести число з найменшою кількістю цифр
    public static void minimumDiffDigits(int[] ints) {
        int result = 11;
        for (int i: ints) {
            if (amountOfDiffDigits(i) < result) {
                result = i;
            }
        }
        System.out.println("Число з найменшою кількістю різних цифр: " + result);
    }
}
