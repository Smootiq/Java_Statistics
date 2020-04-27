package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Сумма всех продаж
        long sum = service.calculateSum(purchases);
        String message1 = "_Month total";
        System.out.println(sum + message1);

        // Средняя сумма продаж
        long average = sum / 12;
        String message2 = "_AverageSales";
        System.out.println(average + message2);

        // Максимальная сумма продаж
        long max = service.findMax(purchases);
        String message3 = "_MaxSales";
        System.out.println(max + message3);

        // Минимальная сумма продаж
        long min = service.findMin(purchases);
        String message4 = "_MinSales";
        System.out.println(min + message4);
    }
}