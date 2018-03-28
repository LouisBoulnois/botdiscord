package game.personnages;

import game.objets.Arme;
import game.objets.Casque;

public class Equipement {
    private Casque casque;
    private Arme arme;

    public Casque getCasque() {
        return casque;
    }

    public void setCasque(Casque casque) {
        this.casque = casque;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }
}
