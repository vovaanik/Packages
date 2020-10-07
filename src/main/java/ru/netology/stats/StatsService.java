
package ru.netology.stats;

public class StatsService<array> {

    public int sum(int[] array) {
        int result = 0;
        for (int amount : array) {
            result += amount;
        }
        return result;

    }


    public int average(int[] array) {
        return sum(array) / array.length;

    }


    public int MaxMonth(int[] array) {
        int max = Max(array);

        int result = 0;
        int month = 1;
        for (int amount : array) {
            if (amount == max) {
                result = month;
            }
            month++;
        }

        return result;
    }

    public int Max(int[] array) {
        int max = 0;

        for (int amount : array) {
            if (amount > max) {
                max = amount;
            }
        }
        return max;
    }


    public int MinMonth(int[] array) {
        int min = Min(array);

        int result = 0;
        int month = 1;
        for (int amount : array) {
            if (amount == min) {
                result = month;
            }
            month++;
        }
        return result;
    }
    public int Min(int[] array) {

        int min = array[0];
        for (int amount : array) {
            if (amount < min) {
                min = amount;
            }
        }
        return min;
    }
    public int UpperAverageMonth(int[] array) {
        int average = average(array);
        int count = 0;
        for (int amount : array){
            if (amount > average) {
                count++;
              }
            }
        return count;
        }
    public int LowerAverageMonth(int[] array) {
        int average = average(array);
        int count = 0;
        for (int amount : array){
            if (amount < average) {
                count++;
            }
        }
        return count;
    }
}










