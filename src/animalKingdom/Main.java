package animalKingdom;

import java.util.*;

public class Main {

    // public static void printAnimals(ArrayList<Animals> list, )
    public static void main(String[] args) {

        Mammals m1 = new Mammals("Panda", 1869);
        Mammals m2 = new Mammals("Zebra", 1778);
        Mammals m3 = new Mammals("Koala", 1816);
        Mammals m4 = new Mammals("Sloth", 1804);
        Mammals m5 = new Mammals("Armadillo", 1758);
        Mammals m6 = new Mammals("Raccoon", 1758);
        Mammals m7 = new Mammals("Bigfoot", 2021);

        // System.out.println(m1.toString());

        Birds b1 = new Birds("Pigeon", 1837);
        Birds b2 = new Birds("Peacock", 1821);
        Birds b3 = new Birds("Toucan", 1758);
        Birds b4 = new Birds("Parrot", 1824);
        Birds b5 = new Birds("Swan", 1758);

        // System.out.println(b5.toString());

        Fish f1 = new Fish("Salmon", 1758);
        Fish f2 = new Fish("Catfish", 1817);
        Fish f3 = new Fish("Perch", 1758);

        // System.out.println(f2.toString());

        ArrayList<Animals> animalList = new ArrayList<Animals>();

        animalList.add(m1);
        animalList.add(m2);
        animalList.add(m3);
        animalList.add(m4);
        animalList.add(m5);
        animalList.add(m6);
        animalList.add(m7);

        animalList.add(b1);
        animalList.add(b2);
        animalList.add(b3);
        animalList.add(b4);
        animalList.add(b5);

        animalList.add(f1);
        animalList.add(f2);
        animalList.add(f3);

        System.out.println(animalList);

        System.out.println("\n*** Sorted by name ***\n");
        animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(animalList);

        System.out.println("\n*** Sorted by year ***\n");
        animalList.sort((v1, v2) -> Integer.toString(v1.getYearDiscovered()).compareToIgnoreCase(Integer.toString(v2.getYearDiscovered())));
        System.out.println(animalList);

        System.out.println("\n*** Sorted by how they move ***\n");
        animalList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        System.out.println(animalList);

        System.out.println("\n*** only breath with lungs ***\n");
        animalList.forEach(animal -> {
            if (animal.breath() == "lungs") {
                System.out.println(animal);
            }
        });

        System.out.println("\n*** only breath with lungs and named in 1758 ***\n");
        animalList.forEach(animal -> {
            if (animal.breath() == "lungs" && animal.getYearDiscovered() == 1758) {
                System.out.println(animal);
            }
        });

        System.out.println("\n*** only breath with lungs and lay eggs ***\n");
        animalList.forEach(animal -> {
            if (animal.breath() == "lungs" && animal.reproduce() == "eggs") {
                System.out.println(animal);
            }
        });

        ArrayList<Animals> namedIn1758 = new ArrayList<Animals>();
        System.out.println("\n*** only named in 1758 ***\n");
        animalList.forEach(animal -> {
            if (animal.getYearDiscovered() == 1758) {
                namedIn1758.add(animal);
            }
        });

        System.out.println(namedIn1758);


    }
}