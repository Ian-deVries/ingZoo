package com.ing.zoo.Animal;

import com.ing.zoo.Animal.Type.Carnivorous;

public class Snake extends Animal implements Carnivorous {
    public String name;
    public String helloText;
    public String eatText;

    public Snake() {
    }

    public void sayHello()
    {
        helloText = "hisss hisss";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "I have a sixpack and nothing to do!";
        System.out.println(eatText);
    }

    public String getName() {
        return name;
    }
}
