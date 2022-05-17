package chapter2exercises;
// Завдання
// С1 розділу 2
// Відсортувати рядки матриці в порядку зростання значень елементів стовпця k
// Відсортувати стовбці матриці в порядку зростання значень елементів рядка k

public class C1_SortUpCurrentLineOrColumn {

    // Метод сортує рядки матриці в порядку зростання значень елементів стовпця k
    public static void sortMatrixLinesByColumn(int k, int[][] matrix) {
        if (k <= matrix.length) {
            boolean sortable = true;
            int temp;

            while (sortable) {
                sortable = false;

                for (int i = 1; i < matrix.length; i++) {
                    if (matrix[i][k] < matrix[i - 1][k]) {
                        for (int x = 0; x < matrix[i].length; x++) {
                            temp = matrix[i - 1][x];
                            matrix[i - 1][x] = matrix[i][x];
                            matrix[i][x] = temp;
                        }
                        sortable = true;
                    }
                }
            }
        }else System.out.println("Такого стовпця не існує!");

    }

    // Метод сортує стовпці матриці в порядку зростання значень елементів рядка k
    public static void sortMatrixColumnsByLine(int k, int[][] matrix) {

        if (k <= matrix.length) {
            boolean sortable = true;
            int temp;
            while (sortable) {
                sortable = false;

                for (int i = 1; i < matrix[k].length; i++) {

                    if (matrix[k][i] < matrix[k][i - 1]) {
                        for (int x = 0; x < matrix.length; x++) {
                            temp = matrix[x][i - 1];
                            matrix[x][i - 1] = matrix[x][i];
                            matrix[x][i] = temp;
                        }
                        sortable = true;
                    }
                }
            }
        }else System.out.println("Такого рядка не існує!");

    }
}
