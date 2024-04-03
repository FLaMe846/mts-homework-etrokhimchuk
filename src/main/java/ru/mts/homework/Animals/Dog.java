package ru.mts.homework.Animals;

public class Dog extends Pet{

    public Dog(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }
    public static Dog getRandomDog(){
        return new Dog(getRandBreed(), getRandName(), getRandCost(), getRandCharacter());
    }

    @Override
    public String toString(){
        return "Собака: " + "порода=" + breed +  ", имя=" + name +", стоимость=" + cost + ", характер=" + character;   }
}