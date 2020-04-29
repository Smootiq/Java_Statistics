package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Сумма всех продаж
        int total = service.calculateSum(purchases);
        System.out.println(total);

        // Средняя сумма продаж
        int average = total / 12;
        System.out.println(average);

        // Максимальная сумма продаж
        int max = service.findMax(purchases);
        System.out.println(max);

        // Минимальная сумма продаж
        int min = service.findMin(purchases);
        System.out.println(min);

        // Количество месяцев, где продажи ниже среднего
        int saleslow = total / max * 12 / average;
        System.out.println(saleslow);

        // Количество месяцев, где продажи выше среднего
        int saleshigh = average * 12 / max;
        System.out.println(saleshigh);
    }
}