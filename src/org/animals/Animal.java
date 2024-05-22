package org.animals;

public abstract class Animal {

    public Animal getClass;
    private String name;

    public Animal(String name){
        setName(name);
    }
    public static void sleep() {
        System.out.println("ZZZ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public abstract void makeNoise();
    public abstract String[] geteat() throws IllegalArgumentException;

}
