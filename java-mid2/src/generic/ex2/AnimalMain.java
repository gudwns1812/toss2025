package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);
        Dog value = dogBox.getValue();
        System.out.println("value = " + value);

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        Cat value1 = catBox.getValue();
        System.out.println("value1 = " + value1);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        Animal value2 = animalBox.getValue();
        System.out.println("value2 = " + value2);

    }
}
