package chapter1exercises;
// Вивести задану кількість випадкових чисел з переходом чи без переходу на нову строку
import java.util.Random;

public class A3_ShowRandomNumbers {
    public static void showRandomNums(int howMany, boolean withNewLine) {
        Random random = new Random();

        if (howMany <= 0) {
            System.out.println("Введене число менше нуля!");
        } else if (withNewLine) {
            for (int i = 0; i < howMany; i++) {
                System.out.println(random.nextInt());
            }
        } else {
            for (int i = 0; i < howMany; i++) {
                System.out.print(random.nextInt() + " ");
            }
        }

    }
}
