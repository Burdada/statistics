package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public int averSales(int[] sales) {

        int sumSales = sumSales(sales);
        int averSumSales = sumSales / sales.length;
        return averSumSales;
    }

    public int lowMonths(int[] sales) {
        int months = 0;
        int averSumSales = averSales(sales);
        for (int sale : sales) {
            if (sale < averSumSales) {
                months = months + 1;
            }

        }
        return months;
    }

    public int highMonths(int[] sales) {
        int months = 0;
        int averSumSales = averSales(sales);
        for (int sale : sales) {
            if (sale > averSumSales) {
                months = months + 1;
            }

        }
        return months;
    }
    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

}
