package chapter1exercises;
// Вивести:
// // - щасливі числа

public class B9_HappyNumbers {
    public static void showHappyNums(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 99999 && ints[i] < 1000000) {
                int number1 = ints[i] / 100000;
                int number2 = (ints[i] / 10000) % 10;
                int number3 = (ints[i] / 1000) % 10;
                int number4 = (ints[i] / 100) % 10;
                int number5 = (ints[i] / 10) % 10;
                int number6 = ints[i] % 10;
                if (number1 + number2 + number3 == number4 + number5 + number6) {
                    System.out.print(ints[i] + " ");
                }
            }
        }
    }

}
