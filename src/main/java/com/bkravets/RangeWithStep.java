package com.bkravets;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeWithStep implements Iterable<Integer> {
    private int start;
    private int end;
    private int step;

    public RangeWithStep(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new RangeIteratorWithStep();
    }

    private class RangeIteratorWithStep implements Iterator<Integer> {

        private int currentElement;

        public RangeIteratorWithStep() {
            currentElement = start;
        }

        @Override
        public boolean hasNext() {
            return currentElement <= end;
        }

        @Override
        public Integer next() {
            if(currentElement > end) {
                throw new NoSuchElementException();
            }

            int temp = currentElement;
            currentElement += step;
            return temp;
        }
    }
}
