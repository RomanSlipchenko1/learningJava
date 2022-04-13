package chapter1exercises;
// Вивести:
// // - прості числа з масиву

public class B6_ShowPrimeNumbers {
    public static void showPrimeNumbers(int[] ints) {
        System.out.println("Прості числа з масиву: ");
        boolean isPrime;

        for (int anInt : ints) {
            isPrime = true;
            if (anInt > 1) {
                for (int x = 2; x <= Math.sqrt(anInt); x++) {
                    if (anInt % x == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else isPrime = false;

            if (isPrime) {
                System.out.print(anInt + " ");
            }
        }
    }
}
