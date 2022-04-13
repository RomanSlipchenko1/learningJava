package chapter1exercises;

// Вивести:
// Парні елементи масиву
// Непарні елементи масиву

public class B1_DoubleAndUnpairNumbers {

    public static void showPairNumsFromIntsArray(int[] ints) {
        System.out.println("Парні числа масиву: ");
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                System.out.print(ints[i] + " ");
            }
        }
    }

    public static void showUNPairNumsFromIntsArray(int[] ints) {
        System.out.println("Парні числа масиву: ");
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                System.out.print(ints[i] + " ");
            }
        }
    }


}
