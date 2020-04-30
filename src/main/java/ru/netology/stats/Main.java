package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minValue = numbers[0];
        int minIndex = 0;
        int maxValue = numbers[0];
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println( "Number month min sales: " + maxIndex );
        System.out.println( "Number month max sales: " + minIndex );

        // Сумма всех продаж
        int total = service.calculateSum( numbers );
        System.out.println( "Total sum: " + total );

        // Средняя сумма продаж
        int average = total / 12;
        System.out.println( "Average sales: " + average );
    }
}