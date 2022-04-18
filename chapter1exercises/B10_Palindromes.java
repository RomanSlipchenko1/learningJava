package chapter1exercises;

// Вивести:
// // - числа паліндроми
// Перевіряти відповідність символів в рядку попарно

public class B10_Palindromes {
    public static void showPalindromesFromArray(int [] ints) {
        System.out.println("Числа паліндроми: ");

        for (int anInt : ints) {
            if (isNumberPalindrome(anInt)) {
                System.out.print(anInt + " ");
            }
        }
    }

    public static boolean isNumberPalindrome(int input) {
        String str = Integer.toString(input);
        int n = str.length();
        boolean bool = true;

        for (int x = 0; x < n / 2; x++) {
            if (str.charAt(x) != str.charAt(n - 1)) {
                bool = false;
                break;
            }
            n -= 1;
        }
        return bool;
    }

}
