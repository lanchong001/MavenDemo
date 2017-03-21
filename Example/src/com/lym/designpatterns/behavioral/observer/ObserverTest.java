package com.lym.designpatterns.behavioral.observer;

/**
 * Created by lym on 2017/3/21.
 */
public class ObserverTest {

    public static void main(String[] args)
    {
        Subject mm = new Secretary();
        Observer o1 = new NBAObserver("小张",mm);
        Observer o2 = new StockObserver("小李",mm);
        mm.add(o1);
        mm.add(o2);

        mm.setSubjectStatue("老板回来了 ");
        mm.notifyObserver();

        Subject boss = new Boss();
        Observer o3 = new NBAObserver("小张",boss);
        Observer o4 = new StockObserver("小李",boss);
        boss.add(o3);
        boss.add(o4);
        boss.setSubjectStatue("我回来了 ");
        boss.notifyObserver();
    }
}
