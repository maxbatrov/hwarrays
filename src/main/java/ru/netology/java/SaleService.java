package ru.netology.java;

public class SaleService {

    public int getSumSales(int[] sale) {
        int sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
        }
        return sum;
    }

    public int getAverageSumSales(int[] sale) {
        return getSumSales(sale) / sale.length;
    }

    public int maxSumSales(int[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSumSales(int[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lessSumAverage(int[] sale) {
        int month = 0;
        int averageSales = getAverageSumSales(sale);
        for (int sum : sale) {
            if (sum < averageSales) {
                month++;
            }
        }
        return month;
    }

    public int higherSumAverage(int[] sale) {
        int month = 0;
        int averageSales = getAverageSumSales(sale);
        for (int sum : sale) {
            if (sum > averageSales) {
                month++;
            }
        }
        return month;
    }
}
