package chapter1exercises;
// Вивести:
// // - елементи, які рівні півсумі сусідніх елементів

public class B11_HalfSumm {
    public static void halfSumm(int[] ints) {
        System.out.println("Елементи масиву, рівні півсумі сусідніх елементів: ");
        for (int i = 1; i < ints.length - 1; i++) {
            if (((double)ints[i]) == (int) Math.ceil((ints[i - 1] + ints[i + 1]) / 2f)) {
                System.out.print(ints[i] + " ");
            }
        }
    }
}
