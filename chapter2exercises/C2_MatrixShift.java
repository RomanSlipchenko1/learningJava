package chapter2exercises;
// Завдання С2 розділу 2
// Виконати циклічний здвиг матриці на k позицій вверх, вниз, вліво, вправо

// Додати захист від здвигу на кількість кроків, меншу за 1

public class C2_MatrixShift {

    // Циклічний здвиг матриці вверх на задану кількість кроків
    public static void shiftMatrixUp(int numOfSteps, int[][] matrix) {
        int first;
        for (int steps = 0; steps < numOfSteps; steps++) {
            for (int column = 0; column < matrix.length; column++) {
                first = matrix[0][column];
                for (int element = 0; element < matrix[column].length - 1; element++) {
                    matrix[element][column] = matrix[element + 1][column];
                }
                matrix[matrix.length - 1][column] = first;
            }
        }
    }

    // Циклічний здвиг матриці вниз на задану кількість кроків
    public static void shiftMatrixDown(int numOfSteps, int[][] matrix) {
        int first;
        for (int steps = 0; steps < numOfSteps; steps++) {
            for (int column = 0; column < matrix.length; column++) {
                first = matrix[matrix.length - 1][column];
                for (int element = matrix.length - 1; element > 0; element--) {
                    matrix[element][column] = matrix[element -1][column];
                }
                matrix[0][column] = first;
            }
        }
    }

    // Циклічний здвиг матриці вліво на задану кількість кроків
    public static void shiftMatrixLeft(int numOfSteps, int[][] matrix) {
        int first;
        for (int steps = 0; steps < numOfSteps; steps++) {
            for (int line = 0; line < matrix.length; line++) {
                first = matrix[line][0];
                for (int element = 0; element < matrix[line].length - 1; element++) {
                    matrix[line][element] = matrix[line][element + 1];
                }
                matrix[line][matrix[line].length - 1] = first;
            }

        }
    }

    // Циклічний здвиг матриці вправо на задану кількість кроків
    public static void shiftMatrixRight(int numOfSteps, int[][] matrix) {
        int first;
        for (int steps = 0; steps < numOfSteps; steps++) {
            for (int line = 0; line < matrix.length; line++) {
                first = matrix[line][matrix[line].length - 1];
                for (int element = matrix[line].length - 1; element > 0; element--) {
                    matrix[line][element] = matrix[line][element - 1];
                }
                matrix[line][0] = first;
            }
        }
    }

}
