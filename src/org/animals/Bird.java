package org.animals;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("cip cip");
    }

    @Override
    public String[] geteat() throws IllegalArgumentException {
        String[] eat={"semi"};
        return eat;
    }
}
