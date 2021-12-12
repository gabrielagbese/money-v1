package com.money.engine;

public class Main {

    public static void main(String[] args) {

        Budget a = new Budget();
        a.duration = 31;
        a.amount = 40000;

        a.makeDays();
        printDayList(a);

        Spread s = new Spread();
        s.spreadDuration = 7;
        s.spreadTotal = -10000;
        s.startDay = 5;
        s.spreadMoney(a);

        printDayList(a);

    }
    public static void printDayList(Budget budget){
        for (int i = 0;i<budget.dayList.size();i++){
            System.out.println(budget.dayList.get(i).day+" total = "+budget.dayList.get(i).daily_total);
        }
    }

}
