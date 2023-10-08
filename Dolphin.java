package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        this.habitat = habitat;
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString() {
        return super.toString() + ", Habitat: " + habitat + ", Swimming Speed: " + swimmingSpeed;
    }

}

