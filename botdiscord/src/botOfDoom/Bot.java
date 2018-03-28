package botOfDoom;

import botOfDoom.command.CommandMap;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;
import java.util.Scanner;

public class Bot implements Runnable{
    private final JDA jda;
    private final CommandMap commandMap = new CommandMap(this);
    private boolean running;
    private final Scanner scanner = new Scanner(System.in);

    public Bot() throws LoginException, IllegalArgumentException,RateLimitedException{
        jda = new JDABuilder(AccountType.BOT).setToken("NDI2MzQwNDc3NTIwOTY5NzMw.DZcu_Q.ASS4UN8HF8SOHW0xpidY9-E5r4g").buildAsync();
        jda.addEventListener(new HeyListen(commandMap));
    }

    public void setRunning(boolean running){
        this.running=running;
    }


    @Override
    public void run() {
        running = true;
        while (running){
            if(scanner.hasNextLine()) commandMap.commandConsole(scanner.nextLine());
        }
        scanner.close();
        jda.shutdown();
        System.exit(0);
    }

    public static void main(String[] args){
        try {
            Bot bot = new Bot();
            new Thread(bot,"bot").start();
        }catch (LoginException | IllegalArgumentException | RateLimitedException e){
            e.printStackTrace();
        }
    }

    public JDA getJda() {
        return jda;
    }
}
