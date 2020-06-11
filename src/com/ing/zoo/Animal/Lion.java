package com.ing.zoo.Animal;

import com.ing.zoo.Animal.Type.Carnivorous;

public class Lion extends Animal implements Carnivorous {
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    public String getName() {
        return name;
    }
}
