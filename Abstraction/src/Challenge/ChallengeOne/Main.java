package Challenge.ChallengeOne;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog("yorkie",15));
        animalList.add(new Dog("wolf",100));
        animalList.add(new Fish("whale",700));
        animalList.add(new Fish("dolphin",300));
        animalList.add(new Horse("clydesdale",800));

        for(Animal animal: animalList) {
            if ((animal.getType().equalsIgnoreCase("wolf") && animal instanceof Dog) ||
                    (animal.getType().equalsIgnoreCase("dolphin") && animal instanceof Fish)) {
                doActivity(animal, "faster");
            } else {
                doActivity(animal, "slowly");
            }
        }

        System.out.println(animalList);

    }

    public static void doActivity(@NotNull Animal animal, String speed) {
        animal.move(speed);
        animal.makeNoise();
        if (animal instanceof Mammal mammal) {
            mammal.shredHair();
        }
        System.out.println("-".repeat(30));
    }
}
