package ru.netology.javaqa.Squares.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testCalcSearchThreeSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testCalcSearchZeroSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(0, 10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSearchOneSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(50, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSearchFourSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(99, 180);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSearchSameSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSearchTwoSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 260);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSearchNegativeSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(-100, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSearchLotSquares() {
        SQRService service = new SQRService();
        int actual = service.calc(99, 1_000_000);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }
}