package chapter2exercises;
// Вивести елементи масиву в зворотньому порядку

public class B2_ReverseAndShowArray {
    public static void showArrayReversed(int[] ints) {
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i] + " ");
        }
    }
}
