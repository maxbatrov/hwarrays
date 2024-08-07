package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatSaleServiceTest {

    @Test
    public void shouldFoundSum() {
        SaleService service = new SaleService();

        int[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedSum = 152 + 233 + 374 + 459 + 561 + 672 + 785 + 897 + 105 + 112 + 321 + 345;
        int actualSum = service.getSumSales(sale);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFoundAverageSum() {
        SaleService service = new SaleService();

        int[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedAvrg = (152 + 233 + 374 + 459 + 561 + 672 + 785 + 897 + 105 + 112 + 321 + 345) / 12;
        int actualAvrg = service.getAverageSumSales(sale);

        Assertions.assertEquals(expectedAvrg, actualAvrg);

    }

    @Test
    public void foundMaxSumSale() {
        SaleService service = new SaleService();

        int[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedMax = 8;
        int actualMax = service.maxSumSales(sale);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void foundMinSumSale() {
        SaleService service = new SaleService();

        int[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedMin = 9;
        int actualMin = service.minSumSales(sale);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void foundLessSumAverage() {
        SaleService service = new SaleService();

        int[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedLessAvrg = 7;
        int actualLessAvrg = service.lessSumAverage(sale);

        Assertions.assertEquals(expectedLessAvrg, actualLessAvrg);
    }


    @Test
    public void foundHigherSumAverage() {
        SaleService service = new SaleService();

        int[] sale = {152, 233, 374, 459, 561, 672, 785, 897, 105, 112, 321, 345};

        int expectedHighAvrg = 5;
        int actualHighAvrg = service.higherSumAverage(sale);

        Assertions.assertEquals(expectedHighAvrg, actualHighAvrg);
    }


}


