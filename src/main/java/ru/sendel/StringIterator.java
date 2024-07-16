package ru.sendel;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringIterator implements Iterator<Character>{

    private final String string;
    private int currentIndex;

    public StringIterator(String string){
        this.string = string;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < string.length();
    }

    @Override
    public Character next() {
        if(currentIndex >= string.length()){
            throw new NoSuchElementException("Символы закончились!");
        }

        var nextChar = string.charAt(currentIndex);
        currentIndex++;
        return nextChar;
    }
}
