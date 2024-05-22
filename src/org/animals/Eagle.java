package org.animals;

public class Eagle extends Animal implements Volare{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("ca ca ca");
    }

    @Override
    public String[] geteat() throws IllegalArgumentException {
        String[] eat={"pesci","lucertole","topi"};
        return eat;
    }

    @Override
    public void vola() {
        System.out.println("volo");


    }
}
