package chapter1exercises;
// Ввести з консолі n цілих чисел
// Повертає масив введених чисел
import java.util.Scanner;

public class B0_EnterNumbers {
    public static int[] enterYourNums() {
        System.out.println("Введіть всі числа через пробіл та натисніть Enter: ");
        Scanner scanner = new Scanner(System.in);

        String[] stringsArray = scanner.nextLine().split(" ");
        int[] ints = new int[stringsArray.length];

        for (int i = 0; i < stringsArray.length; i++) {
            try {
                ints[i] = Integer.parseInt(stringsArray[i]);
            }catch (NumberFormatException e) {
                System.out.println("В індексі " + i + " не число або не ціле число!");
                System.out.println("Введіть цілочисленне значення та натисність Enter: ");
                ints[i] = scanner.nextInt();
            }
        }
        return ints;
    }
}

