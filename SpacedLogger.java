package com.promineotech;

public class SpacedLogger implements Logger{
    @Override
    public void log(String input) {
        //prints out all characters except the last one to put a space after each of them
        for(int i = 0; i < input.length() - 1; i++) {
            System.out.print(input.charAt(i) + " ");
        }
        //Last character printed separately to both prevent an extra space at the end
        // and to add an extra line for any other potential outputs after this method on the command line
        System.out.println(input.charAt(input.length() - 1));
        //Another println to add a space between methods
        System.out.println();
    }

    @Override
    public void error(String input) {
        System.out.print("ERROR: ");
        //Same idea as the previous method. All but last character printed with the
        // last character printed with println to avoid extra space and to return cursor to next line.
        for(int i = 0; i < input.length() - 1; i++) {
            System.out.print(input.charAt(i) + " ");
        }
        System.out.println(input.charAt(input.length() - 1));
        //Another println to add a space between methods
        System.out.println();
    }
}
