package com.ing.zoo.Animal;

import com.ing.zoo.Animal.Type.Carnivorous;
import com.ing.zoo.Animal.Type.TrickAnimal;

import java.util.Random;

public class Tiger extends Animal implements Carnivorous, TrickAnimal {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger()
    {
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }

    public String getName() {
        return name;
    }
}
