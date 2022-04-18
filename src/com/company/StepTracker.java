package com.company;

import java.util.Random;

public class StepTracker {

    int goal = 10000;

    // Заполнение массива случайными числами
    public static void arraySet(int[][] allStepsArray) {
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 30; j++) {
                allStepsArray[i][j] = random.nextInt(20000);
            }
        }

    }

    // Считает общее кол-во шагов за какой-то месяц
    public static int allMonthSteps(int month, int[][] allStepsArray) {
        int monthSteps = 0;
        for (int i = 0; i < 30; i++) {
            monthSteps = monthSteps + allStepsArray[month][i];
        }
        return monthSteps;
    }

    // Считает максимальное кол-во шагов в месяце
    public static int maxSteps(int month, int[][] allStepsArray) {
        int maxSteps = 0;
        for (int i = 0; i < 30; i++) {
            if (maxSteps < allStepsArray[month][i]) {
                maxSteps = allStepsArray[month][i];
            }
        }
        return maxSteps;
    }

    // Считает среднее кол-во шагов в месяце
    public static double averageStep(int month, int[][] allStepsArray) {
        int monthSteps = 0;
        for (int i = 0; i < 30; i++) {
            monthSteps = monthSteps + allStepsArray[month][i];
        }
        double averageStep = monthSteps / 30;
        return averageStep;
    }

    // Вычисляет лучшую серию
    public static int bestSeries(int goal, int month, int[][] allStepsArray) {
        int series = 0;
        int bestSeries = 0;
        for (int i = 0; i < 30; i++) {
            if (allStepsArray[month][i] >= goal) {
                series = series + 1;
            } else {
                bestSeries = series;
                series = 0;
            }
        }
        return bestSeries;
    }

    // Вывод количества шагов в каждый день месяца
    public static void stepList(int month, int[][] allStepsArray) {
        for (int i =0; i < 30; i++) {
            System.out.print(i + 1 + " день: " + allStepsArray[month][i] + ". ");
        }
    }
}

