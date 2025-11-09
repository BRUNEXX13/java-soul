package br.com.ss.multithreading;

public class Counter {
    int count = 0;

    void increment() {
        count++;
    }

    int getCount() {
        return count;
    }

    static void main() {
        Counter counter = new Counter();
        counter.count = 10;
        System.out.println(counter.getCount());
    }
}
