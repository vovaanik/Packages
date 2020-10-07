package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StatsServiceTest {


    StatsService service = new StatsService();
    int[] expectedArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSum() {

        int expected = 180;
        int actual = service.sum(expectedArray);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAverage() {

        int expected = 15;
        int actual = service.average(expectedArray);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonth() {

        int expected = 8;
        int actual = service.MaxMonth (expectedArray);

        assertEquals(expected, actual);
    }
    @Test
    void shouldMinMonth() {

        int expected = 9;
        int actual = service.MinMonth (expectedArray);

        assertEquals(expected, actual);
    }
    @Test
    void shouldUpperAverage() {

        int expected = 5;
        int actual = service.UpperAverageMonth(expectedArray);

        assertEquals(expected, actual);
    }
    @Test
    void shouldLowerAverage() {

        int expected = 5;
        int actual = service.LowerAverageMonth(expectedArray);

        assertEquals(expected, actual);
    }
}






