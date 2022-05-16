package chapter2exercises;
// Виводить матрицю вирівняною з врахуванням мінусів перед числами

public class C0_ShowMatrix {
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < matrix[i].length; x++) {

                if (matrix[i][x] >= 0) {
                    System.out.print(" " + matrix[i][x]);
                } else {
                    System.out.print(matrix[i][x]);
                }

                if (x != matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
