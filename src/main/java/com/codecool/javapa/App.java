package com.codecool.javapa;

import java.util.Timer;

public class App {
    public static void main ( String[] args ) {

        Timer timer = new Timer();
        timer.schedule(new AppLogic(), 0, 1000);

    }
}
