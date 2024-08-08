package ru.netology.stats;

public class StatsService {

    public long getSumSales(long[] sale) {
        long sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
        }
        return sum;
    }

    public long getAverageSumSales(long[] sale) {
        return getSumSales(sale) / sale.length;
    }

    public int maxSumSales(long[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSumSales(long[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lessSumAverage(long[] sale) {
        int month = 0;
        long averageSales = getAverageSumSales(sale);
        for (long sum : sale) {
            if (sum < averageSales) {
                month++;
            }
        }
        return month;
    }

    public int higherSumAverage(long[] sale) {
        int month = 0;
        long averageSales = getAverageSumSales(sale);
        for (long sum : sale) {
            if (sum > averageSales) {
                month++;
            }
        }
        return month;
    }
}
