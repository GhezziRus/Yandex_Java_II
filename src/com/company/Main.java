package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BestSeries bestSeries = new BestSeries();

        bestSeries.series();

        /*
        int goal = 10000;
        // Заполняю массив кол-вом шагов
        int[][] allStepsArray = new int[12][30];
        StepTracker stepTracker = new StepTracker();
        stepTracker.arraySet(allStepsArray);

        // Считаю количество шагов за какой-то месяц
        System.out.println("В апреле вы прошли "+ stepTracker.allMonthSteps(4, allStepsArray));

        // Показываю максимальное кол-во шагов в месяце
        System.out.println("Максимум в месяце " + stepTracker.maxSteps(4, allStepsArray));

        // Вывожу пройденые километры и калории
        Converter converter = new Converter();
        System.out.println("Kilometers = " + converter.distanceConvert(stepTracker.allMonthSteps(4, allStepsArray)));
        System.out.println("Kalories = " + converter.kalAll(stepTracker.allMonthSteps(4, allStepsArray)));


        // Вывожу среднее количество шагов в месяц
        System.out.println("Среднее количество шагов: " + stepTracker.averageStep(4, allStepsArray));

        // Лучшая серия
        System.out.println("Лучшая серия: " + stepTracker.bestSeries(goal, 4, allStepsArray) +  " дней.");

        // Список количества шагов каждый день
        stepTracker.stepList(4, allStepsArray);

         */
    }
}
