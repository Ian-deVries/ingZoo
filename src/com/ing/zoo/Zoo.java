package com.ing.zoo;

import com.ing.zoo.Animal.*;
import com.ing.zoo.Animal.Type.Carnivorous;
import com.ing.zoo.Animal.Type.Herbivorous;
import com.ing.zoo.Animal.Type.TrickAnimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig snowball = new Pig();
        snowball.name = "snowball";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Snake billy = new Snake();
        billy.name = "billy";
        MountainLion leo = new MountainLion();
        leo.name = "leo";

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(snowball);
        animals.add(wally);
        animals.add(marty);
        animals.add(billy);
        animals.add(leo);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        if(input.equals(commands[0])) {
            for(Animal a : animals){
                a.sayHello();
            }
        } else if(input.startsWith("hello ")) {
            String name = input.replace("hello ", "");
            for(Animal a : animals){
                if(a.getName().equals(name)){
                    a.sayHello();
                }
            }
        } else if(input.equals(commands[1])) {
            for(Animal a : animals){
                if(a instanceof Herbivorous){
                    ((Herbivorous) a).eatLeaves();
                }
            }

        } else if(input.equals(commands[2])) {
            for(Animal a : animals){
                if(a instanceof Carnivorous){
                    ((Carnivorous) a).eatMeat();
                }
            }

        } else if(input.equals(commands[3])) {
            for(Animal a : animals){
                if(a instanceof TrickAnimal){
                    ((TrickAnimal) a).performTrick();
                }
            }

        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
