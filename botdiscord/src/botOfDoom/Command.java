package botOfDoom;
import botOfDoom.command.Command.ExecutorType;
import botOfDoom.mysql.ConnexionSQL;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

public class Command {

    private final Bot bot;

    public Command(Bot bot){
         this.bot = bot;
    }

    @botOfDoom.command.Command(name="stopnow", description = "Permet de connaitre les commandes",type = ExecutorType.ALL)
    public void stop(){
        bot.setRunning(false);
    }

    @botOfDoom.command.Command(name = "commandes", description = "Voir les commandes", type = ExecutorType.USER)
    public void showCommandes(User user, MessageChannel channel){
        channel.sendMessage("Prefix: RP. \n commandes \n ");
    }

    @botOfDoom.command.Command(name="newPerso", description = "Créer un nouveau personnage", type = ExecutorType.USER)
    public void createJoueur(User user, MessageChannel channel){

    }


}
