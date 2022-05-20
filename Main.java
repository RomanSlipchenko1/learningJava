import chapter2exercises.C0_CreateMatrix;
import chapter2exercises.C0_ShowMatrix;
import chapter2exercises.C3_ContinuousSequences;

public class Main {

    public static void main(String[] args) {
        //int[][] matrix = C0_CreateMatrix.createMatrix();
        //C0_ShowMatrix.showMatrix(matrix);
        //System.out.println();
        //System.out.println("_______________");
        //C3_ContinuousSequences.continuousSequenceUp(matrix);

        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] matrix2 = {{16, 15, 14, 13}, {14, 6, 7, 0}, {0, 1, 6, 5}, {4, 3, 2, 1}};
        int[][] matrix3 = {{16, 15, 14, 16}, {14, 6, 7, 0}, {0, 1, 6, 5}, {4, 3, 2, 1}};
        int[][] matrix4 = {{16, 15, 14, 13}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix5 = {{100, 200, 300, 13}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 2, 3, 4}};
        int[][] matrix6 = {{16, 15, 14, 13}, {17, 0, 0, 0}, {0, 0, 0, 0}, {4, 3, 2, 1}};

        int[][] matrix7 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};

        int[][] matrix8 = {{-1, -2, -3, -4}, {-5, -6, -7, -8}, {-9, -10, -11, -12}, {-13, -14, -15, -16}};
        C3_ContinuousSequences.continuousSequenceUp(matrix1);
        C3_ContinuousSequences.continuousSequenceUp(matrix2);
        C3_ContinuousSequences.continuousSequenceUp(matrix3);
        C3_ContinuousSequences.continuousSequenceUp(matrix4);
        C3_ContinuousSequences.continuousSequenceUp(matrix5);
        C3_ContinuousSequences.continuousSequenceUp(matrix6);
        C3_ContinuousSequences.continuousSequenceUp(matrix7);
        C3_ContinuousSequences.continuousSequenceUp(matrix8);
    }
}
