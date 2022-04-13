package chapter1exercises;
// Вивести:
// // - всі тризначні числа масиву, в десятичному запису яких немає однакових цифр

public class B5_ThreeDigitsWithDiffNumbers {
    public static void showIt(int[] ints) {
        System.out.println("Тризначні числа, в десятичному запису яких немає однакових цифр: ");

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 99 && ints[i] < 1000) {
                int a, b, c;
                a = ints[i] / 100;
                b = ints[i] / 10 % 10;
                c = ints[i] % 10;
                if (a != b && a != c && b != c) {
                    System.out.print(ints[i] + " ");
                }
            }
        }
    }
}
