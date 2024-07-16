package ru.sendel;

public class Main {
    public static void main(String[] args) {
        var iterable = new StringIterable("Collection Framework");
        var iterator = iterable.iterator();

        // обходи с помощью методов
        System.out.println("Обход через while:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //обход с помощью for, любой Iterable
        //можно обойти через for

        System.out.println("Обход через for:");
        for(var ch: iterable){
            System.out.println(ch);
        }
    }
}
