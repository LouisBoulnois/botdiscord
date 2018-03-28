package game.personnages;

public class Joueur extends Personnage {
    private int experience;
    private Equipement equipement;

    public Joueur(String name){
        super(name);
        experience = 0;
    }

    public void attaque(Personnage personnage){
        int damage = 0;
        if(this.equipement.getArme() != null) {
            switch (this.equipement.getArme().getTypeArme().getStatsUse()) {
                case "force":
                    damage += this.getCarac().getForce();
                    break;
                case "dexterite":
                    damage += this.getCarac().getDexterite();
                    break;
                case "agilite":
                    damage += this.getCarac().getAgilite();
                    break;
                case "robustesse":
                    damage += this.getCarac().getRobustesse();
                    break;
                default:
                    damage += 0;
            }
        }
        else {
            damage = this.getCarac().getForce();
        }
        personnage.setVie(personnage.getVie()-this.getCarac().getForce());
    }
}
