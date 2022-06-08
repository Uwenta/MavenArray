package ru.netology.stats;

public class StatsService {

    public int getTotalAmount(int[] sales) {

        int totalAmount = 0;
        for (int sale : sales) totalAmount = totalAmount + sale;
        return totalAmount;

    }

    public int getAverageAmount(int[] sales) {
        int totalAmount = getTotalAmount(sales);
        int averageAmount = totalAmount / sales.length;
        return averageAmount;

    }

    public int getMaxMonth(int[] sales) {
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

    public int getMinMonth(int[] sales) {
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

    public int getMonthsLessAverage(int[] sales) {
        int month = 0;
        int averageAmount = getAverageAmount(sales);
        for (int sale : sales) {
            if (sale < averageAmount) {
                month = month + 1;
            }
        }
        return month;
    }

    public int getMonthsMoreAverage(int[] sales) {
        int months = 0;
        int averageAmount = getAverageAmount(sales);
        for (int sale : sales) {
            if (sale > averageAmount) {
                months = months + 1;
            }
        }
        return months;
    }


}
