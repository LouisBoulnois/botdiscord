package game.objets;

public class Arme {
    private int degatMin;
    private int degatMax;
    private TypeArme typeArme;
    private float durabilite;
    private float poid;

    public int getDegatMin() {
        return degatMin;
    }

    public void setDegatMin(int degatMin) {
        this.degatMin = degatMin;
    }

    public int getDegatMax() {
        return degatMax;
    }

    public void setDegatMax(int degatMax) {
        this.degatMax = degatMax;
    }

    public TypeArme getTypeArme() {
        return typeArme;
    }

    public void setTypeArme(TypeArme typeArme) {
        this.typeArme = typeArme;
    }

    public float getDurabilite() {
        return durabilite;
    }

    public void setDurabilite(float durabilite) {
        this.durabilite = durabilite;
    }

    public float getPoid() {
        return poid;
    }

    public void setPoid(float poid) {
        this.poid = poid;
    }
}
