package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class zoomanagement {
    public static void main(String[] args) {
        zoo myZoo = new zoo("Mon zoo", "Ma ville");
        animal lion = new animal("new", "Lion", 5, true);

        myZoo.addAnimal(lion);
        myZoo.listAnimals();

        animal lion2 = new animal("new", "Lion", 5, true);
        myZoo.addAnimal(lion2);
        myZoo.listAnimals();

        myZoo.removeAnimal(lion);
        myZoo.listAnimals();

        zoo anotherZoo = new zoo("Zoo2", "Ville2");
        animal elephant = new animal("Mammifère", "Éléphant", 10, true);
        anotherZoo.addAnimal(elephant);
        anotherZoo.listAnimals();

        zoo biggerZoo = zoo.comparerZoo(myZoo, anotherZoo);
        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est " + biggerZoo.getName());
        }

        Aquatic aquaticAnimal = new Aquatic();
        Terrestrial terrestrialAnimal = new Terrestrial(4);
        Dolphin dolphin = new Dolphin("Océan", 15.0f);
        Penguin penguin = new Penguin("Antarctique", 30.0f);
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

    }
}

