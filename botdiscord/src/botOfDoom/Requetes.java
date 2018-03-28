package botOfDoom;

import botOfDoom.mysql.ConnexionSQL;
import net.dv8tion.jda.core.entities.User;

import java.sql.ResultSet;
import java.sql.Statement;

public class Requetes {
    private ConnexionSQL connexionSQL = null;

    public Requetes(){
        connexionSQL = new ConnexionSQL();
    }


    public void createUser(User user){
        try{
            ResultSet res = connexionSQL.getStmp().executeQuery("select ID_USER from joueur where ID_DISCORD = "+user.getId());
            if(res==null){
                ResultSet residCarac = connexionSQL.getStmp().executeQuery("select MAX(ID_CARAC) from Caracteristique");
                int idCarac = (int)residCarac.getObject(0);
                idCarac++;
                String insert = "INSERT INTO Caracteristique VALUES ("+idCarac+",5,0,0,0,0,0)";
                connexionSQL.getStmp().executeUpdate(insert);
                insert = "INSERT INTO joueur VALUES ("+user.getId()+","+user.getName()+"1,"+idCarac+",0)";
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
