package Circus;

import Circus.animals.Animal;
import Circus.animals.Bird;
import Circus.animals.Duck;
import Circus.animals.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck duck = new Duck();
        getToSpeak(duck);

        Bird bird = (Bird) duck;  // upcasting
        getToSpeak(bird);

        Animal a = (Animal) bird; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        train(new Parrot());

//        Animal a2 = new Animal();
//        Bird b2 = new Bird();

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if(bird instanceof Duck) {
            Duck duck = (Duck) bird;
            duck.swim();
        } else {
            System.out.println("I am not a duck");
        }
    }
}
