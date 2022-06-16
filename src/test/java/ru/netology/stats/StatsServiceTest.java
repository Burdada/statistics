package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldGetSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);


    }
    @Test
    public void shouldGetAverSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverSum = 15;
        int actualAverSum = service.averSales(sales);
        Assertions.assertEquals(expectedAverSum, actualAverSum);


    }
    @Test
    public void shouldGetMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSalesMonth(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }
    @Test
    public void shouldGetMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSalesMonth(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);

    }
    @Test
    public void shouldGetLowMonths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLowMonths = 5;
        int actualLowMonths = service.lowMonths(sales);
        Assertions.assertEquals(expectedLowMonths, actualLowMonths);

    }@Test
    public void shouldGetHighMonths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedHighMonths = 5;
        int actualHighMonths = service.highMonths(sales);
        Assertions.assertEquals(expectedHighMonths, actualHighMonths);
    }

}
