package com.ing.zoo.Animal;

import com.ing.zoo.Animal.Type.Herbivorous;

public class Hippo extends Animal implements Herbivorous {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    public String getName() {
        return name;
    }
}
