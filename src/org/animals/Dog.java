package org.animals;

public class Dog  extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bau Bau");

    }

    @Override
    public String[] geteat(){
        String[] eat={"ossi","crocchette","scatolette in umido"};
        return eat;
    }
}
