package ru.sendel;

import java.util.Iterator;

public class StringIterable implements Iterable<Character>{
    private final String string;

    public StringIterable(String string) {
        this.string = string;
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringIterator(string);
    }
}
