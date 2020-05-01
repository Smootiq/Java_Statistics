package ru.netology.stats;

import static ru.netology.stats.StatsService.calculateAverage;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Сумма всех продаж
        int total = service.calculateSum(numbers);
        System.out.println("Total sum: " + total);

        // Средняя сумма продаж
        int average = service.calculateAverage(numbers);
        System.out.println("Average sales: " + average);

        // Номер месяца, где был пик продаж
        int maxIndex = service.calculateMax(numbers);
        System.out.println("MaxIndex: " + maxIndex);

        // Номер месяца, где был минимум продаж
        int minIndex = service.calculateMin(numbers);
        System.out.println("MinIndex: " + minIndex);

        // Кол-во месяцев, в которых продажи были ниже среднего
        int lowAverage = service.calculateLowAverage(numbers);
        System.out.println("LowAverage: " + lowAverage);

        // Кол-во месяцев, в которых продажи были выше среднего
        int highAverage = service.calculateHighAverage(numbers);
        System.out.println("HighAverage: " + highAverage);
    }
}