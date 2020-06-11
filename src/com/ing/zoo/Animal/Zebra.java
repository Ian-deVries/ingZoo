package com.ing.zoo.Animal;

import com.ing.zoo.Animal.Type.Herbivorous;

public class Zebra extends Animal implements Herbivorous {
    public String name;
    public String helloText;
    public String eatText;

    public Zebra()
    {
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    public String getName() {
        return name;
    }
}
