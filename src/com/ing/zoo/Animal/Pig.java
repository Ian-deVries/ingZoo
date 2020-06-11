package com.ing.zoo.Animal;

import com.ing.zoo.Animal.Type.Carnivorous;
import com.ing.zoo.Animal.Type.Herbivorous;
import com.ing.zoo.Animal.Type.TrickAnimal;

import java.util.Random;

public class Pig extends Animal implements Carnivorous, Herbivorous, TrickAnimal {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Pig()
    {
    }

    public void sayHello()
    {
        helloText = "oink oink";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }

    public String getName() {
        return name;
    }
}
