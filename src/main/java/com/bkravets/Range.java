package com.bkravets;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer>{
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    private  class RangeIterator implements Iterator<Integer> {
        private int currentElement;

        public RangeIterator() {
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
            return currentElement++;
        }
    }
}
