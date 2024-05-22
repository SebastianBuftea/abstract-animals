package org.animals;

public class Dolphin extends Animal implements Nuotare{


    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("iiiiii");
    }

    @Override
    public String[] geteat() throws IllegalArgumentException {
        String[] eat={"plancton","pesci"};
        return eat;
    }

    @Override
    public void nuotare() {
        System.out.println("nuoto");
    }
}
