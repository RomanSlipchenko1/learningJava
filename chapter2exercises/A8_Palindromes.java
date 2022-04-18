package chapter2exercises;
// Знайти числа-паліндроми
// Якщо їх декілька, показати друге

import chapter1exercises.B10_Palindromes;

public class A8_Palindromes {

    public static void showSecondOrFirstPalindromeFromArray(int[] ints) {
        int counter = 0;
        int[] result = new int[2];
        System.out.println("Числа паліндроми з масиву: ");
        for (int i: ints) {
            if (B10_Palindromes.isNumberPalindrome(i)) {
                result[counter] = i;
                counter++;
            }
            if (counter == 2) break;
        }
        // Показати перший, якщо немає другого
        if (counter == 1) {
            System.out.println("Знайдено один паліндром: " + result[0]);
        } else if (counter == 2) {
            System.out.println("Знайдено декілька паліндромів, другий з них: " + result[1]);
        }else System.out.println("Паліндромів в масиві не знайдено.");
    }
}
