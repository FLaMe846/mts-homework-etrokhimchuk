package ru.mts.homework.Animals;
import java.util.List;
import java.util.Random;

public abstract class AbstractAnimal implements Animal{
    protected String breed;
    protected String name;
    protected double cost;
    protected String character;

    public AbstractAnimal(String breed, String name, Double cost, String character)
    {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    public static String getRandBreed() {
        List<String> listOfBreeds = List.of("Порода1", "Порода2", "Порода3", "Порода4");
        return listOfBreeds.get(new Random().nextInt(listOfBreeds.size()));
    }

    public static String getRandName() {
        List<String> listOfNames = List.of("Шаркбой", "Панда", "Батарейка", "Митбол", "Картон", "Мусорный бак");
        return listOfNames.get(new Random().nextInt(listOfNames.size()));
    }

    public static double getRandCost() {
        return Math.random()*500;
    }

    public static String getRandCharacter() {
        List<String> listOfCharacter = List.of("Буйный", "Спокойный", "Задумчивый", "Веселый", "Суицидальный");
        return listOfCharacter.get(new Random().nextInt(listOfCharacter.size()));
    }

}