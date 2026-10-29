package edu.neu.mgen;

class Animals {
    String name;
    String species;
    double size;
    double weight;
    String diet;

    Animals(String name, String species, double size, double weight, String diet) {
        this.name = name;
        this.species = species;
        this.size = size;
        this.weight = weight;
        this.diet = diet;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Specie: " + species);
        System.out.println("Size: " + size + " cms");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Diet: " + diet);
    }
    
}

class Bird extends Animals {
    double wingspan;
    boolean canFly;

    Bird(String name, String species, double size, double weight, String diet, double wingspan, boolean canFly) {
        super(name, species, size, weight, diet);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingspan + " cms");
        System.out.println("Can Fly: " + canFly);
    }

}

class LandAnimal extends Animals {
    int numberOfLegs;

    LandAnimal(String name, String species, double size, double weight, String diet, int numberOfLegs) {
        super(name, species, size, weight, diet);
        this.numberOfLegs = numberOfLegs;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}

class Fish extends Animals {
    int numberOfFins;
    String waterType;

    Fish(String name, String species, double size, double weight, String diet, int numberOfFins, String waterType) {
        super(name, species, size, weight, diet);
        this.numberOfFins = numberOfFins;
        this.waterType = waterType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Fins: " + numberOfFins);
        System.out.println("Type of water the fish swims in: " + waterType);
    }
}

public class AnimalKingdom {
    public static void main(String[] args) {
        Bird bird = new Bird("Songbird", "American Goldfinch", 13, 0.02, "Vegeterian", 25, true);

        LandAnimal landAnimal = new LandAnimal("Tiger", "Bengal Tiger", 310, 260, "Predator", 4);

        Fish fish = new Fish("Bony fish", "Salmon", 100, 10, "Predator", 8, "Freshwater and Saltwater");

        System.out.println("---BIRD---");
        bird.displayInfo();

        System.out.println("---LAND ANIMAL---");
        landAnimal.displayInfo();

        System.out.println("---FISH---");
        fish.displayInfo();
    }

}
