package tn.esprit.gestionzoo.entities;

public class zoo {
    public static final int MAX_CAGES = 20;

    private animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;

    public zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrCages = MAX_CAGES;
        this.animals = new animal[MAX_CAGES];
        this.animalCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public boolean addAnimal(animal animal) {
        if (!isZooFull()) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
            return false;
        }
    }

    public void listAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println("Animal " + (i + 1) + ": " + animals[i].getName());
        }
    }

    public int searchAnimal(animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = animals[animalCount - 1];
            animals[animalCount - 1] = null;
            animalCount--;
            System.out.println("Animal " + animal.getName() + " a été supprimé du zoo.");
            return true;
        } else {
            System.out.println("Animal " + animal.getName() + " n'a pas été trouvé dans le zoo.");
            return false;
        }
    }

    public static zoo comparerZoo(zoo z1, zoo z2) {
        if (z1.getAnimalCount() > z2.getAnimalCount()) {
            return z1;
        } else if (z2.getAnimalCount() > z1.getAnimalCount()) {
            return z2;
        } else {
            System.out.println("Les zoos ont le même nombre d'animaux.");
            return null;
        }
    }

    public String toString() {
        return "Nom du zoo: " + name + ", Ville du zoo: " + city + ", Nombre de cages: " + nbrCages;
    }
}
