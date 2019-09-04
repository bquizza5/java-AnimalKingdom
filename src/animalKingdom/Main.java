package animalKingdom;

public class Main {
    public static void main(String[] args) {

        Mammals m1 = new Mammals("panda", 1869);
        Mammals m2 = new Mammals("Zebra", 1778);
        Mammals m3 = new Mammals("Koala", 1816);
        Mammals m4 = new Mammals("Sloth", 1804);
        Mammals m5 = new Mammals("Armadillo", 1758);
        Mammals m6 = new Mammals("Raccoon", 1758);
        Mammals m7 = new Mammals("Bigfoot", 2021);

        System.out.println(m1.toString());

        Birds b1 = new Birds("Pigeon", 1837);
        Birds b2 = new Birds("Peacock", 1821);
        Birds b3 = new Birds("Toucan", 1758);
        Birds b4 = new Birds("Parrot", 1824);
        Birds b5 = new Birds("Swan", 1758);

        System.out.println(b5.toString());

        Fish f1 = new Fish("Salmon", 1758);
        Fish f2 = new Fish("Catfish", 1817);
        Fish f3 = new Fish("Perch", 1758);

        System.out.println(f2.toString());

    }
}