package chapter1exercises;

import org.jetbrains.annotations.NotNull;

// Вивести:
// // - числа паліндроми
// Потрібно розвернути int
// Записати його в String
// Перевіряти відповідність символів в рядку попарно
// 12345
public class B10_Palindromes {
    public static void showPalindromes(int [] ints) {
        System.out.println("Числа паліндроми: ");
        for (int anInt : ints) {
            String str = Integer.toString(anInt);
            int n = str.length();
            boolean bool = true;

            for (int x = 0; x < n / 2; x++) {
                if (str.charAt(x) != str.charAt(n - 1)) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                System.out.print(str + " ");
            }
        }
    }
}
