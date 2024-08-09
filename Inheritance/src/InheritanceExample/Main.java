package InheritanceExample;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animalActivity(animal,"slowly");
        Animal animal2 = new Animal("Elephant","Huge",10000);
        animalActivity(animal2,"medium speed");
        Animal animal3 = new Animal("Cat");
        animalActivity(animal3,"faster");
        System.out.println("================");
        Dog dog = new Dog();
        animalActivity(dog,"quicker");
        Dog yorkie = new Dog("Yorkie",15);
        animalActivity(yorkie,"fast");
        Dog germanShepard = new Dog("Pricky","Scoopy");
        animalActivity(germanShepard,"fast");
        Dog retriever = new Dog("Golden Retriever",22,"folded","scooped");
        animalActivity(retriever,"slow");
        Fish goldie = new Fish(2,2);
        animalActivity(goldie,"slow");
        Fish whale = new Fish(30,2,2);
        animalActivity(whale,"fast");
        Fish baracuda = new Fish("baracuda",50,2,4);
        animalActivity(baracuda,"fast");
    }

    public static void animalActivity (Animal animal, String speed) {
        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal);
        System.out.println("--------");
    }
}
