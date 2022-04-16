package chapter2exercises;
// Знайти число, що складається тільки з різних цифр
// Якщо їх декілька, вивести перше

import java.util.Arrays;

public class A7_OnlyDifferentDigits {
    public static void onlyDifferentDigits(int[] ints) {
        // Перебирати масив
        // В кожному числі перебирати цифри
        // В регістровий масив 0-9 записувати, скільки разів кожна цифра зустрілась
        // Збільшувати індекс на 1 щоразу, коли цифра зустрілась
        // Якщо будь-яка цифра зустрілась більш, ніж один раз - переходити до наступного елементу
        // Якщо жоден елемент масиву не більший 1 - то число складається з різних цифр

        for (int i: ints) {

            int[] reg = new int[10];
            Arrays.fill(reg, 0);
            int workWith = Math.abs(i);
            boolean bool = true;

            while (workWith > 0) {
                reg[workWith % 10]++;
                if (reg[workWith % 10] > 1) {
                    bool = false;
                    break;
                }
                workWith /= 10;
            }
            if (bool) {
                System.out.println("Перше число, що складається тільки з різних цифр: " + i);
                break;
            } else System.out.println("Чисел з різних цифр не знайдено.");

        }
    }
}
