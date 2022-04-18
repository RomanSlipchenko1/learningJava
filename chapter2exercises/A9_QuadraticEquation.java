package chapter2exercises;
// Знайти корені квадратного рівняння
// ax^2 + bx + c + 0;
// Для квадратного рівняння потрібно ввести три коефіцієнти a, b, c
// 1. Знайти дискримінант - D = b^2 - 4ac;
// 2. Якщо дискримінант більший нуля, то є два корені:
// x1 = (-b + Math.sqrt(D)) / 2a;
// x2 = (-b - Math.sqrt(D)) / 2a;
// 3. Якщо дискримінант рівний нулю, то рівняння має єдиний корінь:
// x = -b / 2a;
// 4. Якщо дискримінант менший нуля, то рівняння не має дійсних коренів

import java.util.Scanner;

public class A9_QuadraticEquation {

    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void quadraticEquation() {
        System.out.println("Програма вирішує квадратне рівняння.");
        System.out.println("Введіть значення a, b, c:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double dscr = discriminant(a, b, c);

        if (dscr > 0) {
            double x1 = (-b + Math.sqrt(dscr)) / (2 * a);
            double x2 = (-b - Math.sqrt(dscr)) / (2 * a);
            System.out.print("Квадратне рівняння має два корені: x1 = " + x1 + " x2 = " + x2);
        } else if (dscr == 0) {
            System.out.println("Квадратне рівняння має один корінь: " + (-b / 2 * a));
        } else if (dscr < 0) {
            System.out.println("Для введених значень дійсних коренів немає. ");
        }
    }
}
