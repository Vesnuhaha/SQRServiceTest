package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {" 'limit values',200,300,3",
    "'lower limit values',0,199,5",
    "'upper limit values',301,1000,14"})
    void shouldCalculate(String testName, int start, int finish, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSquaresService(start, finish);

        assertEquals(expected, actual);
    }

}