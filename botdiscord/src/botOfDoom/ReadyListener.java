package botOfDoom;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {
    public void onReady(ReadyEvent rd){
        String out = "Yolo";

        for(Guild guild : rd.getJDA().getGuilds()){
           out += guild.getName() + "(" + guild.getId() +") \n";
        }
        System.out.println(out);

    }
}
