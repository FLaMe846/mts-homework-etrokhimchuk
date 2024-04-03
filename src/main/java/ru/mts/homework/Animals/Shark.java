package ru.mts.homework.Animals;

public class Shark extends Predator{
    public Shark(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    public static Shark getRandomShark(){
        return new Shark(getRandBreed(), getRandName(), getRandCost(), getRandCharacter());
    }

    @Override
    public String toString(){
        return "Акула: " + "порода=" + breed +  ", имя=" + name +", стоимость=" + cost + ", характер=" + character;    }
}