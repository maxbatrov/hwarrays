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

        long expectedMax = 8;
        long actualMax = service.maxSumSales(sale);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void foundMinSumSale() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        long expectedMin = 9;
        long actualMin = service.minSumSales(sale);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void foundLessSumAverage() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        long expectedLessAvrg = 7;
        long actualLessAvrg = service.lessSumAverage(sale);

        Assertions.assertEquals(expectedLessAvrg, actualLessAvrg);
    }


    @Test
    public void foundHigherSumAverage() {
        StatsService service = new StatsService();

        long[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        long expectedHighAvrg = 5;
        long actualHighAvrg = service.higherSumAverage(sale);

        Assertions.assertEquals(expectedHighAvrg, actualHighAvrg);
    }


}


