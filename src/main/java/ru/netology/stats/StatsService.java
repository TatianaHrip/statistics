package ru.netology.stats;

public class StatsService {    //1
    public int amount(int[] data) {
        int totalSum = 0;
        for (int amount : data) {
            totalSum += amount;
        }
        return totalSum;
    }

    public float AverageSales(int[] data) {   //2
        int sum = 0, month = 1;
        float average = 0;
        for (int ignored : data) {
            sum += average;
            month++;
        }
        average = (float) sum / month;
        return average;
    }


    public int MonthsOfMaxSales(int[] data) {   //3
        int sum = 0, maxMonth = 1;
        for (int month : data) {
            sum++;
            if (maxMonth <= month) {
                maxMonth= month;
            }
        }

        return sum;
    }

    public int MonthsOfMiniSales(int[] data) {   //4
        int sum = 0, miniMonth = data[0], Month = 1;
        for (int month : data) {
            sum++;
            if (miniMonth >= month) {
                miniMonth = month;
                Month = sum;
            }
        }
        return Month;
    }


    public int MonthsSalesBelowAverage(int[] data) {    //5
        int sum = 0,  months = 1;
        float below;
        for (int average : data) {
            sum += average;
            months++;
        }
        below = (float) sum /months;
        for (int average : data) {
            if (average < below) {
                months++;
            }
        }
        return months;
    }

    public int MonthsSalesAboveAverage(int[] data) {  //6
        int sum = 0,  months = 1;
        float average;
        for (int above : data) {
            sum += above ;
            months++;
        }
        average = (float) sum / months;
        for (int above  : data) {
            if (above  > average) {
                months++;
            }
        }
        return months;
    }
}

