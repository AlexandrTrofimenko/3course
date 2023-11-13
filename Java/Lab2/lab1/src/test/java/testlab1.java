import org.example.Problem1;
import org.example.Problem2;
import org.example.Problem3;
import org.example.Problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testlab1 {
    @Test
    void shouldReturnTrue_ifNumberContainsAInHexRepresentation() {
        // given
        int number = 10;

        // when
        boolean actual = Problem1.containsDigitAInHexadecimalRepresentation(number);

        // then
        assertTrue(actual);
    }


    @Test
    void shouldReturnFalse_ifNumberDoesNotContainAInHexRepresentation() {
        // given
        int number = 9;

        // when
        boolean actual = Problem1.containsDigitAInHexadecimalRepresentation(number);

        // then
        assertFalse(actual);
    }
    @Test
    void shouldReturnTrue_isGeometricProgression() {
        String numbers = "16,8,1,2,4";

        boolean actual = Problem4.isGeometricProgression(numbers);

        assertTrue(actual);
    }
    @Test
    void shouldReturnFalse_isGeometricProgression() {
        // given
        String numbers = "2,3,4,5,97,5,3,3,1";

        // when
        boolean actual = Problem4.isGeometricProgression(numbers);

        // then
        assertFalse(actual);
    }
}
