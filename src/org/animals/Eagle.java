package org.animals;

public class Eagle extends Animal{
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
}
