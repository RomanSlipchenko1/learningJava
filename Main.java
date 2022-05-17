
import chapter2exercises.C0_CreateMatrix;
import chapter2exercises.C0_ShowMatrix;
import chapter2exercises.C2_MatrixShift;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = C0_CreateMatrix.createMatrix();
        C0_ShowMatrix.showMatrix(matrix);

        C2_MatrixShift.shiftMatrixDown(0, matrix);
        System.out.println("_____________________");
        C0_ShowMatrix.showMatrix(matrix);
    }
}
