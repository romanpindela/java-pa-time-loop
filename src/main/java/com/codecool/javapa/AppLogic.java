package com.codecool.javapa;

import java.sql.SQLOutput;
import java.util.TimerTask;

public class AppLogic extends TimerTask {
    private static int counter = 0;
    @Override
    public void run () {
        task();
    }

    private void task () {
        counter++;
        System.out.println(counter);
    }
}
