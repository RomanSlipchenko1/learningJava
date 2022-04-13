package chapter1exercises;
// Вивести:
// // - найбільше і найменше число

public class B2_Biggest_SmallestNum {
    public static void showTheBiggestNumFromArray(int[] ints) {
        int result = 0;
        for (int i: ints) {
            if (result < i) {
                result = i;
            }
        }
        System.out.println("Найбільше число в масиві: " + result);
    }

    public static void showTheSmallestNumFromArray(int[] ints) {
        int result = 0;
        for (int i: ints) {
            if (result > i) {
                result = i;
            }
        }
        System.out.println("Найменше число в масиві: " + result);
    }

}
