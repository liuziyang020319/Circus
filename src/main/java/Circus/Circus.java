package Circus;

import Circus.stuff.Cannon;
import Circus.stuff.Equipment;
import Circus.stuff.Ladder;
import Circus.animals.Animal;
import Circus.animals.Duck;
import Circus.animals.Parrot;

public class Circus {
    private static Animal[] animals = {
            new Duck(),
            new Parrot()
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] asset) {
        int total = 0;
        for (Asset e : asset) {
            if (e.getValue() <= 5) {
                // guard clause
                System.out.println("Ignoring low value item: " + e.getValue());
                continue;
            }
            // happy path
            total += e.getValue();
            System.out.println("Adding item value: " + e.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
    }
}
