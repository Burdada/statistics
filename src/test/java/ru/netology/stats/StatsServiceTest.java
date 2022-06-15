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


        int expectedAverSum = 15;
        int actualAverSum = service.averSales(sales);
        Assertions.assertEquals(expectedAverSum, actualAverSum);

        int expectedMinSales = 9;
        int actualMinSales = service.minSalesMonth(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSalesMonth(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);

        int expectedLowMonths = 5;
        int actualLowMonths = service.lowMonths(sales);
        Assertions.assertEquals(expectedLowMonths, actualLowMonths);

        int expectedHighMonths = 5;
        int actualHighMonths = service.highMonths(sales);
        Assertions.assertEquals(expectedHighMonths, actualHighMonths);
    }
    @Test
    public void shouldGetMinus() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, -20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 140;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);


        int expectedAverSum = 11;
        int actualAverSum = service.averSales(sales);
        Assertions.assertEquals(expectedAverSum, actualAverSum);

        int expectedMinSales = 6;
        int actualMinSales = service.minSalesMonth(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSalesMonth(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);

        int expectedLowMonths = 3;
        int actualLowMonths = service.lowMonths(sales);
        Assertions.assertEquals(expectedLowMonths, actualLowMonths);

        int expectedHighMonths = 9;
        int actualHighMonths = service.highMonths(sales);
        Assertions.assertEquals(expectedHighMonths, actualHighMonths);
    }
    @Test
    public void shouldGetEquals() {
        StatsService service = new StatsService();
        int[] sales = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20};

        int expectedSum = 240;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);


        int expectedAverSum = 20;
        int actualAverSum = service.averSales(sales);
        Assertions.assertEquals(expectedAverSum, actualAverSum);

        int expectedMinSales = 12;
        int actualMinSales = service.minSalesMonth(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);

        int expectedMaxSales = 12;
        int actualMaxSales = service.maxSalesMonth(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);

        int expectedLowMonths = 0;
        int actualLowMonths = service.lowMonths(sales);
        Assertions.assertEquals(expectedLowMonths, actualLowMonths);

        int expectedHighMonths = 0;
        int actualHighMonths = service.highMonths(sales);
        Assertions.assertEquals(expectedHighMonths, actualHighMonths);
    }

}
