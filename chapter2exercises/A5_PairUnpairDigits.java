package chapter2exercises;
// Знайти кількість чисел, в яких тільки парні цифри - onlyPairDigits
// Знайти кількість чисел з рівним числом парних і непарних цифр - equalPairUnpairDigitsQuantity

public class A5_PairUnpairDigits {

    public static void onlyPairDigits(int[] ints) {
        // Перебираємо цифри кожного числа з масиву
        // Якщо хоч одне цифра непарна - переходимо до наступного елементу
        // Якщо всі цифри парні - збільшуємо лічильник результату на 1
        int counter = 0;
        for (int i: ints) {
            boolean isItPair = true;
            int workWith = Math.abs(i);

            while (workWith > 0) {
                if ((workWith % 10) % 2 != 0) {
                    isItPair = false;
                    break;
                }
                workWith /= 10;
            }
            if (isItPair) {
                counter++;
            }
        }
        System.out.println("Кількість чисел, всі цифри яких парні: " + counter);
    }

    public static void equalPairUnpairDigitsQuantity(int[] ints) {
        // Рахувати парні і непарні цифри кожного числа
        // Парне число викликає збільшення на 1 лічильника парних чисел
        // Непарне число викликає збільшення на 1 лічильника непарних чисел
        // Нуль - парне число
        // Якщо їх кількість однакова - додавати 1 до лічильника результату

        int resultCounter = 0;
        for (int i: ints) {
            int workWith = Math.abs(i);
            int pairCounter = 0;
            int unpairedCounter = 0;

            if (workWith == 0) {
                pairCounter++;
            }

            while (workWith > 0) {
                if ((workWith % 10) % 2 == 0) {
                    pairCounter++;
                } else if ((workWith % 10) % 2 != 0) {
                    unpairedCounter++;
                }
                workWith /= 10;
            }
            if (pairCounter == unpairedCounter) {
                resultCounter++;
            }
        }
        System.out.println("Кількість чисел з рівною кількістю парних та непарних цифр: " + resultCounter);
    }
}
