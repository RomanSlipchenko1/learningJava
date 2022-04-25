package chapter2exercises;
// Виявити, чи належить число k до інтервалів:
// (n, m] - v1
// [n, m) - v2
// (n, m) - v3
// [n, m] - v4
// [] - включно з m, n
// () - не включаючи m, n

import java.util.Scanner;

public class B3_IsNumberInInterval {

    // (n, m] - v1
    public static boolean isNumInInterval_v1() {
        System.out.println("Метод перевіряє, чи належить число k до інтервалу (n, m]");
        Scanner scanner = new Scanner(System.in);
        int k, n, m;
        System.out.println("Введіть число k: ");
        k = scanner.nextInt();
        System.out.println("Введіть n:");
        n = scanner.nextInt();
        System.out.println("Введіть m:");
        m = scanner.nextInt();

        return k > n && k <= m;
    }

    // [n, m) - v2
    public static boolean isNumInInterval_v2() {
        System.out.println("Метод перевіряє, чи належить число k до інтервалу [n, m)");
        Scanner scanner = new Scanner(System.in);
        int k, n, m;
        System.out.println("Введіть число k: ");
        k = scanner.nextInt();
        System.out.println("Введіть n:");
        n = scanner.nextInt();
        System.out.println("Введіть m:");
        m = scanner.nextInt();

        return k >= n && k < m;
    }

    // (n, m) - v3
    public static boolean isNumInInterval_v3() {
        System.out.println("Метод перевіряє, чи належить число k до інтервалу (n, m)");
        Scanner scanner = new Scanner(System.in);
        int k, n, m;
        System.out.println("Введіть число k: ");
        k = scanner.nextInt();
        System.out.println("Введіть n:");
        n = scanner.nextInt();
        System.out.println("Введіть m:");
        m = scanner.nextInt();

        return k > n && k < m;
    }

    // [n, m] - v4
    public static boolean isNumInInterval_v4() {
        System.out.println("Метод перевіряє, чи належить число k до інтервалу [n, m]");
        Scanner scanner = new Scanner(System.in);
        int k, n, m;
        System.out.println("Введіть число k: ");
        k = scanner.nextInt();
        System.out.println("Введіть n:");
        n = scanner.nextInt();
        System.out.println("Введіть m:");
        m = scanner.nextInt();

        return k >= n && k <= m;
    }

}
