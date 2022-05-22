package Test;
// Спробував написати тести
// Треба продумувати крайні випадки для тестів
// Як організовувати структуру тестів?
import chapter2exercises.C4_SummOfNumsBehind;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C4_SummOfNumsBehindTest {

    @Test
    void sumOfNumsBehind() {

        int[][] matrix1 = {{1, -1, 1, -1}, {1, -1, 1, -1}, {1, -1, 1, -1}};
        int actual = C4_SummOfNumsBehind.sumOfNumsBehind(matrix1);
        int expected = -3;
        assertEquals(expected, actual);

        int[][] matrix2 = {{-1, -1, 1, -1}, {1, -1, 1, -1}, {1, -1, 1, -1}};
        actual = C4_SummOfNumsBehind.sumOfNumsBehind(matrix2);
        expected = -2;
        assertEquals(expected, actual);

        int[][] matrix3 = {{1, 1, 1, -1}, {1, -1, 1, -1}, {1, -1, 1, -1}};
        actual = C4_SummOfNumsBehind.sumOfNumsBehind(matrix3);
        expected = -2;
        assertEquals(expected, actual);

    }
}