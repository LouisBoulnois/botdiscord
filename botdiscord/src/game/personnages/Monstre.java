package game.personnages;

public class Monstre extends Personnage{

    private int donExp;
    private int puissance;

    public Monstre(String name){
        super(name);
    }

    public void attaque(Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getCarac().getForce());
    }

    public int getDonExp() {
        return donExp;
    }

    public void setDonExp(int donExp) {
        this.donExp = donExp;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
