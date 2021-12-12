package com.money.engine;

public class Spread extends Budget{
    public int startDay;
    public int spreadDuration;
    public int spreadTotal;

    public void spreadMoney(Budget b){
        for (int i = startDay-1;i<spreadDuration+startDay-1;i++){
            int spreadAmount = spreadTotal/spreadDuration;
            b.dayList.get(i).daily_total = b.dayList.get(i).daily_total+spreadAmount;
        }
    }
}
