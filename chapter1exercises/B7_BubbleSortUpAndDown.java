package chapter1exercises;
// Вивести:
// // - відсортовані числа (зростання і зменшення)

public class B7_BubbleSortUpAndDown {

    public static void sortArrayUpAndShow(int[] ints) {
        boolean needToBeSorted = true;
        int temp;

        while (needToBeSorted) {
            needToBeSorted = false;
            for (int i = 1; i < ints.length; i++) {
                if (ints[i] < ints[i - 1]) {
                    temp = ints[i - 1];
                    ints[i - 1] = ints[i];
                    ints[i] = temp;
                    needToBeSorted = true;
                }
            }

        }
        // Show the result
        System.out.println("Масив відсортовано за зростанням: ");
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    public static void sortArrayDownAndShow(int[] ints) {
        boolean needToBeSorted = true;
        int temp;

        while (needToBeSorted) {
            needToBeSorted = false;
            for (int i = 1; i < ints.length; i++) {
                if (ints[i] > ints[i - 1]) {
                    temp = ints[i - 1];
                    ints[i - 1] = ints[i];
                    ints[i] = temp;
                    needToBeSorted = true;
                }
            }

        }
        // Show the result
        System.out.println("Масив відсортовано за зменшенням: ");
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

}
