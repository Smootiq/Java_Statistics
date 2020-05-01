package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int purchase : numbers) {
            sum += purchase;
        }
        return sum;
    }
    public int calculateAverage(int[] numbers) {
        int sum = 0;
        for (int purchase : numbers) {
            sum += purchase;
        }
        int average = sum / 12;
        return average;
    }
    public int calculateMin(int[] numbers) {
        int maxValue = numbers[0];
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public int calculateMax(int[] numbers) {
        int minValue = numbers[0];
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public int calculateLowAverage(int[] numbers) {
        int lowAverage = numbers[0];
        int lowIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowAverage) {
                lowAverage = numbers[i];
                lowIndex = i;
            }
            else lowIndex = lowAverage;
        }
        return lowIndex;
    }
    public int calculateHighAverage(int[] numbers) {
        int highAverage = numbers[0];
        int highIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highAverage) {
                highAverage = numbers[i];
                highIndex = i;
            } else highIndex = highAverage;
        }
        return highIndex;
    }
}