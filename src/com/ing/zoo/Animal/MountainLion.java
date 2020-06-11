package com.ing.zoo.Animal;

import com.ing.zoo.Animal.Type.Carnivorous;

public class MountainLion extends Animal implements Carnivorous {
    public String name;
    public String helloText;
    public String eatText;

    public MountainLion()
    {
    }

    public void sayHello()
    {
        helloText = "meow meow";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom I'm on Smoko";
        System.out.println(eatText);
    }

    public String getName() {
        return name;
    }
}
