package com.epam.rd.autotasks;

import java.util.Arrays;

public class DecrementingCarousel {
    int capacity;
    static int[] elements;
    int size = 0;
    boolean called;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public boolean addElement(int element) {
        if (element <= 0 || elements.length == size || called) {
            return false;
        }
        elements[size++] = element;
        return true;
    }

    public CarouselRun run() {
        if (!called) {
            elements = Arrays.copyOf(elements, size);
            called = true;
            return new CarouselRun();
        } else {
            return null;
        }
    }
}