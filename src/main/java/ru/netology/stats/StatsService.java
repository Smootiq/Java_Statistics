package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int purchase : numbers) {
            sum += purchase;
        }
        return sum;
    }

    public static int calculateAverage(int[] numbers) {
        int sum = 0;
        for (int purchase : numbers) {
            sum += purchase;
        }
        return sum / numbers.length;
    }

    public int calculateMax(int[] numbers) {
        int maxValue = numbers[0];
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i+1;
            }
        }
        return maxIndex;
    }

    public int calculateMin(int[] numbers) {
        int minValue = numbers[0];
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i+1;
            }
        }
        return minIndex;
    }

    public static int calculateLowAverage(int[] numbers) {
        int lowAverage = calculateAverage(numbers);
        int count = 0;
        for (int number : numbers) {
            if (number > lowAverage) {
                count++;
            }
        }
        return count;
    }

    public int calculateHighAverage(int[] numbers) {
        int highAverage = calculateAverage(numbers);
        int count = 0;
        for (int number : numbers) {
            if (number < highAverage) {
                count++;
            }
        }
        return count;
    }
}