package botOfDoom;

import botOfDoom.mysql.ConnexionSQL;
import net.dv8tion.jda.core.entities.User;

import java.sql.ResultSet;
import java.sql.Statement;

public class Requetes {
    private ConnexionSQL connexionSQL = new ConnexionSQL();

    public void createUser(User user, String name){
        try{
            ResultSet res = connexionSQL.getStmp().executeQuery("select ID_USER from joueur where ID_DISCORD = "+user.getId());
            if(res==null){

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
