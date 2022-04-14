package chapter2exercises;
// Знайти число, цифри в яких йдуть в порядку строгого зростання
// Вивести це число

public class A6_AreDigitsInNumberSequence {
    public static void showSequences(int[] ints) {
        // Для кожного елементу масиву
        // Перебирати його числа
        // Якщо число нуль - перейти до наступного елементу
        // Інакше перебирати цифри числа
        // Якщо цифри не в строгій послідовності, переключати isItResult в false та переходити до наст. елем.
        // Якщо цифри йдуть в строгій послідовності, відобразити число та завершити метод

        System.out.println("Число, цифри в яких ідуть в порядку строгого зростання: ");
        for (int i: ints) {
            int workWith = Math.abs(i);
            int previousNum;
            boolean isItResult = true;

            if (workWith < 10) {
                isItResult = false;
            } else {

                previousNum = workWith % 10;
                workWith /= 10;

                while (workWith > 0) {
                    if (workWith % 10 != previousNum - 1) {
                        isItResult = false;
                        break;
                    }
                    previousNum = workWith % 10;
                    workWith /= 10;
                }

            }
            if (isItResult) {
                System.out.print(i);
                break;
            }
        }
    }
}
