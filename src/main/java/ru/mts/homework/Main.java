package ru.mts.homework;
import ru.mts.homework.Services.CreateAnimalService;
import ru.mts.homework.Services.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 метод");
        CreateAnimalService createAnimalService1 = new CreateAnimalServiceImpl();
        createAnimalService1.CreateAnimals();
        System.out.println("2 метод");
        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.CreateAnimals();
        System.out.println("3 метод");
        createAnimalServiceImpl.CreateAnimals(15);

    }
}