package chapter2exercises;
// Вивести на консоль ті числа з масиву, довжина яких менша, ніж середня
// Вивести на консоль ті числа з масиву, довжина яких більша, ніж середня
// Виводити їх довжину

public class A3_BiggerThenAverageLength {

    // Повертає довжину числа
    public static int lengthOfInt(int input) {
        int counter = 0;
        while (input > 0) {
            input /= 10;
            counter++;
        }
        return counter;
    }

    // Повертає середню довжину елемента масива
    public static double averageLenth(int[] ints) {
        int sum = 0;
        for (int anInt : ints) {
            sum += lengthOfInt(anInt);
        }
        return (double) sum / ints.length;
    }

    public static void longerThatAverage(int[] ints) {
        System.out.println("Елементи, довжина яких довша, ніж середня довжина елемента масиву: ");
        double average = averageLenth(ints);

        for (int anInt : ints) {
            if (lengthOfInt(anInt) > average) {
                System.out.println(anInt + " має довжину " + lengthOfInt(anInt));
            }
        }
    }

    public static void shorterThatAverage(int[] ints) {
        System.out.println("Елементи, довжина яких довша, ніж середня довжина елемента масиву: ");
        double average = averageLenth(ints);

        for (int anInt : ints) {
            if (lengthOfInt(anInt) < average) {
                System.out.println(anInt + " має довжину " + lengthOfInt(anInt));
            }
        }
    }

}
