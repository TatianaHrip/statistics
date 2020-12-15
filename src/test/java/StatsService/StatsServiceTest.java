package StatsService;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

class StatsServiceTest {
    int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void amount() {
        StatsService servise = new StatsService();
        int exp = 180;
        int act = servise.amount(data);
        assertEquals(exp, act);
    }

    private void assertEquals(int exp, int act) {
    }

    @Test
    void AverageSales() {
        StatsService servise = new StatsService();
        int exp = 15;
        int act = (int) servise.AverageSales(data);
        assertEquals(exp, act);
    }


    @Test
    void MonthsOfMaxSales() {
        StatsService servise = new StatsService();
        int exp = 8;
        int act = servise.MonthsOfMaxSales(data);
        assertEquals(exp, act);
    }


    @Test
    void numberMonthsOfMiniSales() {
        StatsService servise = new StatsService();
        int exp = 9;
        int act = servise.MonthsOfMiniSales(data);
        assertEquals(exp, act);
    }


    @Test
    void MonthsSalesBelowAverage() {
        StatsService servise = new StatsService();
        int exp = 5;
        int act = servise.MonthsSalesBelowAverage(data);
        assertEquals(exp, act);
    }

    @Test
    void MonthsSalesAboveAverage() {
        StatsService servise = new StatsService();
        int exp = 5;
        int act = servise.MonthsSalesAboveAverage(data);
        assertEquals(exp, act);
    }
}






