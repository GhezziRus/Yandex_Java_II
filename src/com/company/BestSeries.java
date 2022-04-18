package com.company;

public class BestSeries {

    public static void series() {

        int[] arrayList = new int[]{2, 12, 64, 9, 55, 81, 19, 7,0,  5, 63, 99, 10, 12, 15, 2, 5, 0, 52, 78};
        int goal = 10;
        int max = 0;
        int series = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] >= goal)
            {
                series++;
            }
            else if (arrayList[i] < goal)
            {
                if (series > max)
                {
                    max = series;
                }
                series = 0;
            }
        }
        if (series > max)
        {
            max = series;
        }
        System.out.println("Максимальная серия = " + max);
    }

}
