package com.money.engine;

import java.util.ArrayList;
import java.util.List;

public class Budget extends Day{
    public int duration;
    public int amount;
    List<Day> dayList = new ArrayList<>();

    public void makeDays() {
        for (int i = 1;i<=duration;i++){
            Day d = new Day();
            d.day = i;
            d.daily_total = amount/duration;
            dayList.add(d);
        }
    }

}
