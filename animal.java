package tn.esprit.gestionzoo.entities;

public class animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void displayanimal() {
        System.out.println("famille : " + family);
        System.out.println("Nom  : " + name);
        System.out.println("Age : " + age);
        System.out.println("isMammal : " + isMammal);
    }

    public String toString() {
        return "Famille: " + family + ", Nom: " + name + ", Âge: " + age + ", Mammifère: " + isMammal;
    }
}
