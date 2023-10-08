package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        this.habitat = habitat;
        this.swimmingDepth = swimmingDepth;
    }
    public String toString() {
        return super.toString() + ", Habitat: " + habitat + ", Swimming Depth: " + swimmingDepth;
    }

}

