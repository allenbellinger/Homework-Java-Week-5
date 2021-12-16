package com.promineotech;

public class AsteriskLogger implements Logger{
    @Override
    public void log(String input) {
        System.out.println("***" + input + "***");
        //println to add a space between methods
        System.out.println();
    }

    @Override
    public void error(String input) {
        //Prints the amount of * to line up with the correct amount of characters for different word lengths.
        for(int i = 0; i < input.length() + 13; i++)
            System.out.print("*");
        //This println is to move to the next line for the next output.
        System.out.println();
        System.out.println("***Error: " + input + "***");
        //Same as first line
        for(int i = 0; i < input.length() + 13; i++)
            System.out.print("*");
        //Another println to move to the next line in case of more command line outputs or inputs
        System.out.println("\n");
    }
}
