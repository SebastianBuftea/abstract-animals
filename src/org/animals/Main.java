package org.animals;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animalKingdom = {new Dog("Chop"), new Dolphin("Taison"), new Bird("Fluffy"),
                new Eagle("Mirko")};

        for(int i=0; i<animalKingdom.length; i++){

            System.out.println(animalKingdom[i].getClass().getSimpleName());
            System.out.println("si chiama: "+animalKingdom[i].getName());
            Animal.sleep();
            animalKingdom[i].makeNoise();
            System.out.println("Mangia: "+Arrays.toString(animalKingdom[i].geteat()));
            System.out.println(" ");
        }
    }
}
