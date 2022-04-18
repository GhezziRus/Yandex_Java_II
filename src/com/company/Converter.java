package com.company;

public class Converter {

    public static double distanceConvert (int allMonthStep) {   // Метод конвертирует шаги в километры
        double distance = allMonthStep * 0.00075;
        return distance;
    }

    public static int kalAll (int allMonthStep) {   // Метод считает калории
        int kal = 0;
        kal = allMonthStep * 50;
        int kkal = kal / 1000;
        return kkal;
    }

}

