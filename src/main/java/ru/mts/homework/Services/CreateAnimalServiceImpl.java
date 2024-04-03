package ru.mts.homework.Services;
import ru.mts.homework.Animals.Animal;
import ru.mts.homework.Services.CreateAnimalService;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    //перегруженный
    public void CreateAnimals(int number) {
        for (int i=0;i<number;i++) {
            int count = new Random().nextInt(4);
            Animal animal = CreateAnimalService.getRandAnimal(count);
            System.out.println(animal);
        }
    }
    //переопределенный
    @Override
    public void CreateAnimals() {
        int i = 0;
        do {
            int count = new Random().nextInt(4);
            Animal animal = CreateAnimalService.getRandAnimal(count);
            System.out.println(animal);
            i++;
        }
        while (i < 7);
    }
}