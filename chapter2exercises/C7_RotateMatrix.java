package chapter2exercises;
// Прокрутити матрицю на 90 градусів проти часової стрілки
// Матриця має бути квадратною або прямокутною

public class C7_RotateMatrix {
    public static int[][] rotateMatrixOn90Left(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

            for (int line = 0; line < matrix.length; line++) {
                for (int element = 0; element < matrix[line].length; element++) {
                    result[element][line] = matrix[line][matrix.length - 1 - element];
                }
            }
        return result;
    }
}
