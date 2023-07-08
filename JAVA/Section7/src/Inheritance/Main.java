package Inheritance;

import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
    /*    Animal animal = new Animal("Generic animal","huge",400);
        doAnimalStuff(animal,"slow");
*/        DOg dog = new DOg();
        doAnimalStuff(dog,"fast");

        DOg yorkie = new DOg("Yorkie",15);
        doAnimalStuff(yorkie,"fast");
        DOg retriever = new DOg("Labrador",65,"Floppe","Sweimmer");
        doAnimalStuff(retriever,"slew");

        DOg wolf = new DOg("Wolf",49);
        doAnimalStuff(wolf,"slow");
        Fish muni = new Fish("Goldie",0.23,2,3);
        doAnimalStuff(muni,"fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}
