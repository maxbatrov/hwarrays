package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatSaleServiceTest {

    @Test
    public void shouldFoundSum() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        long expectedSum = 152 + 233 + 374 + 459 + 561 + 672 + 785 + 897 + 105 + 112 + 321 + 345;
        long actualSum = service.getSumSales(sale);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFoundAverageSum() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        long expectedAvrg = (152 + 233 + 374 + 459 + 561 + 672 + 785 + 897 + 105 + 112 + 321 + 345) / 12;
        long actualAvrg = service.getAverageSumSales(sale);

        Assertions.assertEquals(expectedAvrg, actualAvrg);

    }

    @Test
    public void foundMaxSumSale() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedMax = 8;
        int actualMax = (int) service.maxSumSales(sale);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void foundMinSumSale() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedMin = 9;
        int actualMin = (int) service.minSumSales(sale);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void foundLessSumAverage() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedLessAvrg = 7;
        int actualLessAvrg = (int) service.lessSumAverage(sale);

        Assertions.assertEquals(expectedLessAvrg, actualLessAvrg);
    }


    @Test
    public void foundHigherSumAverage() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedHighAvrg = 5;
        int actualHighAvrg = (int) service.higherSumAverage(sale);

        Assertions.assertEquals(expectedHighAvrg, actualHighAvrg);
    }
}


