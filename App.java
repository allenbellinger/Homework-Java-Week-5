package com.promineotech;

public class App {

    public static void main(String[] args) {
        Logger myAsteriskLogger = new AsteriskLogger();
        myAsteriskLogger.log("Hello");
        myAsteriskLogger.error("Hello");

        Logger mySpacedLogger = new SpacedLogger();
        mySpacedLogger.log("Hello");
        mySpacedLogger.error("Hello");
    }
}
