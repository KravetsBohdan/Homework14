package com.bkravets;

public class RangeApp {
    public static void main( String[] args ) {
        Range range = new Range(1, 20);

        for (Integer item : range) {
            System.out.print(item + " ");
        }

        System.out.println();

        RangeWithStep rangeWithStep = new RangeWithStep(1, 20, 3);

        for (Integer item : rangeWithStep) {
            System.out.print(item + " ");
        }
    }
}
