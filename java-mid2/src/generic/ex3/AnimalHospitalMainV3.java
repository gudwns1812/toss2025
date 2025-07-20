package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();

        dogHospital.set(new Dog("멍멍이1", 100));
        dogHospital.checkup();

        catHospital.set(new Cat("냐옹이1", 300));
        catHospital.checkup();


    }
}
