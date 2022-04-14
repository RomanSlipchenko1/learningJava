package chapter2exercises;
// Ввести n чисел з консолі
// Знайти саме довге і саме коротке число
// Вивести знайдені числа і їх довжину

public class A1_LongestAndShortestNumber {

    public static void longestNumFromArray(int[] ints) {
        String result = Integer.toString(ints[0]);
        for (int i = 1; i < ints.length; i++) {
            if (Integer.toString(ints[i]).length() > result.length()) {
                result = Integer.toString(ints[i]);
            }
        }
        System.out.println("Найдовше число з масиву: ");
        System.out.print(result);
        System.out.println(" .Його довжина: " + result.length());
    }

    public static void shortestNumFromArray(int[] ints) {
        String result = Integer.toString(ints[0]);
        for (int i = 1; i < ints.length; i++) {
            if (Integer.toString(ints[i]).length() < result.length()) {
                result = Integer.toString(ints[i]);
            }
        }
        System.out.println("Найкоротше число з масиву: ");
        System.out.print(result);
        System.out.println(" .Його довжина: " + result.length());
    }

}
