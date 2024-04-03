package ru.mts.homework.Services;
import ru.mts.homework.Animals.*;

import java.util.Random;

public interface CreateAnimalService {
    default void CreateAnimals(){
        int count = 0;
        while (count < 10) {
            int index = new Random().nextInt(4);
            Animal animal = getRandAnimal(index);
            System.out.println(animal);
            count++;
        }
    }

    public static Animal getRandAnimal(int i){
        return switch (i) {
            case 0 -> Cat.getRandomCat();
            case 1 -> Dog.getRandomDog();
            case 2 -> Shark.getRandomShark();
            case 3 -> Wolf.getRandomWolf();
            default -> null;
        };
    }
}