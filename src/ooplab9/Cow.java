package ooplab9;

import ooplap8.pet;

public class Cow extends pet {

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("More More !!!");
    }
}
