package chapter2exercises;
// Округлити всі елементи матриці до цілого

public class C6_RoundMatrixElements {

    public static double[][] RoundMatrixElements(double[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int element = 0; element < matrix[line].length; element++) {
                matrix[line][element] = Math.round(matrix[line][element]);
            }
        }
        return matrix;
    }

}
