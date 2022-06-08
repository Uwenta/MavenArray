package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcTotalAmountWithNullSale() {
        StatsService service = new StatsService();
        int sales[] = {
                0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0
        };
        int expected = 15;
        int actual = service.getTotalAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindFractionAverageAmount() {
        StatsService service = new StatsService();
        int sales[] = {
                3, 125, 35, 56, 7, 23, 5, 86, 12, 85, 10, 1
        };
        int expected = 37;
        int actual = service.getAverageAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindDoubleMaxMonth() {
        StatsService service = new StatsService();
        int sales[] = {
                5, 5, 5, 200, 200, 300, 10, 300, 300, 0, 80, 80
        };
        int expected = 9;
        int actual = service.getMaxMonth(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindDoubleMinMonth() {
        StatsService service = new StatsService();
        int sales[] = {
                5, 5, 5, 200, 200, 300, 10, 300, 300, 10, 80, 80
        };
        int expected = 3;
        int actual = service.getMinMonth(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMonthsLessAverageIfEqualSales() {
        StatsService service = new StatsService();
        int sales[] = {
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
        };
        int expected = 0;
        int actual = service.getMonthsLessAverage(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMonthsMoreAverageIfEqualSales() {
        StatsService service = new StatsService();
        int sales[] = {
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
        };
        int expected = 0;
        int actual = service.getMonthsMoreAverage(sales);
        Assertions.assertEquals(expected, actual);

    }

}


