package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    private long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        long expectedSum = 180;

        long actual = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actual);

    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        long expectedAverageSale = 15;

        long actual = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageSale, actual);

    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int expectedMount = 8;

        int actualMount = service.maxSales(sales);

        Assertions.assertEquals(expectedMount, actualMount);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int expectedMount = 9;

        int actualMount = service.minSales(sales);

        Assertions.assertEquals(expectedMount, actualMount);
    }

    @Test
    public void shouldFindMonthsSalesBelowAverage() {
        StatsService service = new StatsService();

        int expectedMount = 5;

        int actualMount = service.monthsSalesBelowAverage(sales);

        Assertions.assertEquals(expectedMount, actualMount);
    }

    @Test
    public void shouldFindMonthsSalesAboveAverage() {
        StatsService service = new StatsService();

        int expectedMount = 5;

        int actualMount = service.monthsSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMount, actualMount);
    }


}
