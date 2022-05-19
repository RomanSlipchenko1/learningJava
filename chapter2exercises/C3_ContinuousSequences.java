package chapter2exercises;
// Знайти в матриці і вивести найдовшу послідовність зростаючих елементів, які йдуть підряд
// Знайти в матриці і вивести найдовшу послідовність спадаючих елементів, які йдуть підряд

public class C3_ContinuousSequences {

    // Вирівнює матрицю в лінійний масив
    public static int[] roundMatrix(int[][] matrix) {
        int[] result = new int[(matrix.length * matrix.length) + 1]; // +1 - проблема останнього індекса
        int counter = 0;
        for (int line = 0; line < matrix.length; line++) {
            for (int element = 0; element < matrix[line].length; element++) {
                result[counter] = matrix[line][element];
                counter++;
            }
        }
        return result;
    }

    // Шукає і виводить найдовшу послідовність зростаючих елементів, які йдуть підряд
    // В майбутньому переробити так, щоб працювати напряму з матрицею,
    // а не перетворювати в лінійний масив
    // Вирішити проблему останнього індекса, перевіряючи з попереднім індексом і стартуючи з 1

    public static void continuousSequenceUp(int[][] matrix) {
        int[] roundedMatrix = roundMatrix(matrix);
        StringBuilder result = new StringBuilder("");
        StringBuilder tempArray = new StringBuilder("");
        boolean indicator = false;

        // 0 1 2 3 0
        for (int index = 0; index < roundedMatrix.length - 1; index++) {

            if (roundedMatrix[index] < roundedMatrix[index + 1]) { // знайшли послідовність?
                tempArray.append(roundedMatrix[index]).append(" ");
                indicator = true;
            }else if((roundedMatrix[index] >= roundedMatrix[index + 1]) && indicator) { // послідовність закінчилась?
                tempArray.append(roundedMatrix[index]);
                indicator = false;

                if (tempArray.length() > result.length()) {
                    result = new StringBuilder(tempArray);
                }
                // Очистити тимчасовий результат
                tempArray = new StringBuilder("");
            }

        }
        // Якщо весь масив - неперервна послідовність
        if (tempArray.length() > result.length()) {
            result = new StringBuilder(tempArray);
        }
        // Вивести результат
        if (result.length() > 0) {
            System.out.println(result.toString());
        }else System.out.println("Зростаючих послідовностей не знайдено!");

    }













}
