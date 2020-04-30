package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] nubmers) {
        int sum = 0;
        for (int purchase : nubmers) {
            sum += purchase;
        }
        return sum;
    }
}