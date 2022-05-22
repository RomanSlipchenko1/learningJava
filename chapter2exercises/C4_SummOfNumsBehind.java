package chapter2exercises;

// Знайти і вивести суму елементів матриці, що розташовані між
// першим і другим додатніми елементами кожного рядка (невключно)
// 0 - додатнє число

public class C4_SummOfNumsBehind {
    public static int sumOfNumsBehind(int[][] matrix) {
        int result = 0;
        for (int line = 0; line < matrix.length; line++) {
            boolean indicator = false;
            int indexStart = 0;
            int indexFinish = 0;
            for (int element = 0; element < matrix[line].length; element++) {
                if (matrix[line][element] >= 0 && !indicator) {
                    indexStart = element;
                    indicator = true;
                } else if (matrix[line][element] >= 0 && indicator) {
                    indexFinish = element;
                    break;
                }
            }

            indexStart += 1;
            if ((indexFinish - indexStart) > 0) {
                for (; indexStart < indexFinish; indexStart++) {
                    result += matrix[line][indexStart];
                }
            }
        }
        System.out.println("Сума елементів, розташованих між першим і другим додатнім елементами кожного рядка: " + result);
        return result;
    }
}
