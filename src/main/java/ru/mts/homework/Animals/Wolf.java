package ru.mts.homework.Animals;

public class Wolf extends Predator{
    public Wolf(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    public static Wolf getRandomWolf(){
        return new Wolf(getRandBreed(), getRandName(), getRandCost(), getRandCharacter());
    }

    @Override
    public String toString(){
        return "Волк: " + "порода=" + breed +  ", имя=" + name +", стоимость=" + cost + ", характер=" + character;    }
}