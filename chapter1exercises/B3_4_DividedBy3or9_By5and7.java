package chapter1exercises;
// Вивести:
// // - числа, що діляться на 3 або на 9
// // - числа, які діляться на 5 і на 7

public class B3_4_DividedBy3or9_By5and7 {

    public static void showNumsMultipleOf3Or9(int[] ints) {
        System.out.println("Числа масиву, що діляться на 3 або 9: ");
        for (int i: ints) {
            if (i % 9 == 0 | i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void showNumsMultipleOf5And7(int[] ints) {
        System.out.println("Числа масиву, що діляться на 5 і 7: ");
        for (int i: ints) {
            if (i % 5 == 0 && i % 7 == 0 && i != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
