package chapter2exercises;
//  Вивести на екран всі числа від 1 до 100, що діляться на 3 без залишку

import java.util.Scanner;

public class B4_Multiples3 {

    public static void multiplesOfNumberInInterval() {
        System.out.println("Метод показує всі числа діапазону [n - m], що діляться націло на k");
        int k, n, m;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть k:");
        k = scanner.nextInt();
        System.out.println("Введіть n:");
        n = scanner.nextInt();
        System.out.println("Введіть m:");
        m = scanner.nextInt();

        for (int i = n; i <= m; i++) {
            if (i % k == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
