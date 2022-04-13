package chapter1exercises;
// Ввести цілі числа як аргументи кс, підрахувати їх суми і добуток

public class A5_SummAndMultiplyIt {
    public static void summAndMultiplyThemAll(String[] strings) {

        // Конвертуємо масив String в int
        if (strings.length > 0) {
            int[] intArray = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                try {
                    intArray[i] = Integer.parseInt(strings[i]);
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("В індексі " + i + " не число!");
                }
            }

            // Знаходимо добуток і суму
            int summ = intArray[0];
            int multiply = intArray[0];
            for (int i = 1; i < intArray.length; i++) {
                summ += intArray[i];
                multiply *= intArray[i];
            }
            // Виводимо результат
            System.out.println("Сума елементів масиву = " + summ);
            System.out.println("Добуток елементів масиву = " + multiply);

        } else System.out.println("Ви запустили програму без аргументів!");

    }
}
