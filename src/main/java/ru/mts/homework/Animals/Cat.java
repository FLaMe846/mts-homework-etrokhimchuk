package ru.mts.homework.Animals;

public class Cat extends Pet {

    public Cat(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }
    public static Cat getRandomCat(){
        return new Cat(getRandBreed(), getRandName(), getRandCost(), getRandCharacter());
    }
    @Override
    public String toString(){
        return "Кошка: " + "порода=" + breed +  ", имя=" + name +", стоимость=" + cost + ", характер=" + character;
    }
}