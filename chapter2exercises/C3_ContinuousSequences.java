package chapter2exercises;
// Знайти в матриці і вивести найдовшу послідовність зростаючих елементів, які йдуть підряд (або першу)
// Знайти в матриці і вивести найдовшу послідовність спадаючих елементів, які йдуть підряд (або першу)

// Можна переробити так, щоб працювати з індексами, а не StringBuilder

/*
Можна переробити так, щоб працювати напряму з матрицею, без перетворення в лінійний масив,
зробивши ітератор, який враховує перехід на новий рядок
*/

/* Цікаво було зробити методи саме з індикатором послідовності і двома SB, які "конкурують"
між собою за звання більш підходящого значення.
Індикатор послідовності дозволяє мати два режими роботи блока else-if:
1 - коли поточний елемент і наступний не утворюють послідовність
2 - коли поточний елемент і наступний не утворюють послідовність, але послідовність була до цього,
отже, це кінець послідовності і потрібно виконати певні дії.
Код громіздкий і алгоритм можна спростити, якщо працювати з індексами
 */

public class C3_ContinuousSequences {

    // Метод вирівнює квадратну матрицю в лінійний масив
    public static int[] roundMatrix(int[][] matrix) {
        int[] result = new int[(matrix.length * matrix.length)];
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
    public static void continuousSequenceUp(int[][] matrix) {
        int[] roundedMatrix = roundMatrix(matrix);
        StringBuilder result = new StringBuilder("");
        int resultLength = 0;
        StringBuilder tempArray = new StringBuilder("");
        int tempArrayLength = 0;
        boolean indicator = false;

        for (int index = 0; index < roundedMatrix.length - 1; index++) {

            if (roundedMatrix[index] < roundedMatrix[index + 1]) { // знайшли послідовність?
                tempArray.append(roundedMatrix[index]).append(" ");
                tempArrayLength++;
                indicator = true;

                // Додає значення останнього індексу в результат, якщо послідовність закінчується
                // одночасно з масивом
                if (index == roundedMatrix.length - 2) {
                    tempArray.append(roundedMatrix[index + 1]).append(" ");
                    tempArrayLength++;
                }
                // Цей else if спрацьовує лише після того, як послідовність почалась
            } else if ((roundedMatrix[index] >= roundedMatrix[index + 1]) && indicator) { // послідовність закінчилась?
                tempArray.append(roundedMatrix[index]);
                tempArrayLength++;
                indicator = false;

                if (tempArrayLength > resultLength) {
                    result = new StringBuilder(tempArray);
                    resultLength = tempArrayLength;
                }
                // Очистити тимчасовий результат
                tempArray = new StringBuilder("");
                tempArrayLength = 0;
            }

        }
        // Якщо весь масив - неперервна послідовність
        if (tempArrayLength > resultLength) {
            result = new StringBuilder(tempArray);
            resultLength = tempArrayLength;
        }
        // Вивести результат
        if (resultLength > 1) {
            System.out.println("Найдовша зростаюча послідовність: ");
            System.out.println(result.toString());
        } else System.out.println("Зростаючих послідовностей не знайдено!");

    }

    // Шукає і виводить найдовшу послідовність спадаючих елементів, які йдуть підряд
    public static void continuousSequenceDown(int[][] matrix) {
        int[] roundedMatrix = roundMatrix(matrix);
        StringBuilder result = new StringBuilder("");
        int resultLength = 0;
        StringBuilder tempArray = new StringBuilder("");
        int tempArrayLength = 0;
        boolean indicator = false;

        for (int index = 0; index < roundedMatrix.length - 1; index++) {

            if (roundedMatrix[index] > roundedMatrix[index + 1]) { // знайшли послідовність?
                tempArray.append(roundedMatrix[index]).append(" ");
                tempArrayLength++;
                indicator = true;

                // Додає значення останнього індексу в результат, якщо послідовність закінчується
                // одночасно з масивом
                if (index == roundedMatrix.length - 2) {
                    tempArray.append(roundedMatrix[index + 1]).append(" ");
                    tempArrayLength++;
                }
                // Цей else if спрацьовує лише після того, як послідовність почалась
            } else if ((roundedMatrix[index] <= roundedMatrix[index + 1]) && indicator) { // послідовність закінчилась?
                tempArray.append(roundedMatrix[index]).append(" ");
                tempArrayLength++;
                indicator = false;

                if (tempArrayLength > resultLength) {
                    result = new StringBuilder(tempArray);
                    resultLength = tempArrayLength;
                }
                // Очистити тимчасовий результат
                tempArray = new StringBuilder("");
                tempArrayLength = 0;
            }

        }
        // Якщо весь масив - неперервна послідовність
        if (tempArrayLength > resultLength) {
            result = new StringBuilder(tempArray);
            resultLength = tempArrayLength;
        }
        // Вивести результат
        if (resultLength > 1) {
            System.out.println("Найбільша послідовність спадаючих чисел:");
            System.out.println(result.toString());
        } else System.out.println("Спадаючих послідовностей не знайдено!");

    }


}
