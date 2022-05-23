package Test;

import chapter2exercises.C6_RoundMatrixElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C6_RoundMatrixElementsTest {

    @Test
    void roundMatrixElements() {
        double[][] matrix = {{1.0, 1.25, 1.5, 1.6}, {-1.0, -1.25, -1.5, -1.6}};
        double[][] actual = C6_RoundMatrixElements.RoundMatrixElements(matrix);
        double[][] expected = {{1.0, 1.0, 2.0, 2.0}, {-1.0, -1.0, -1.0, -2.0}};
        assertArrayEquals(expected, actual);
    }
}