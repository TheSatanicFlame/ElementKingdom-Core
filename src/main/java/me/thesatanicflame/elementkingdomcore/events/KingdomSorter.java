package me.thesatanicflame.elementkingdomcore.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class KingdomSorter implements Listener {

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if (!p.hasPlayedBefore()){
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            int nationnumber = (int) (Math.random() * 8) + 1;
            int bender = (int) (Math.random() * 3) + 1;


            switch (nationnumber){
                case 1:
                case 5:
                case 8:
                    p.sendMessage(ChatColor.GREEN + "You've been sorted into the Earth Kingdom!");
                    String command = "k setkingdom " + p.getName() + " earthkingdom";
                    Bukkit.dispatchCommand(console, command);
                    command = "lp user " + p.getName() + " parent add earth";
                    Bukkit.dispatchCommand(console, command);


                    if (bender == 3){
                        command = "b choose" + " Earth " + p.getName();
                        p.sendMessage(ChatColor.GREEN + "You've been born with the power of Earthbending!");
                        Bukkit.dispatchCommand(console, command);

                    }
                    break;
                case 2:
                case 6:
                    p.sendMessage(ChatColor.AQUA + "You've been sorted into the Water Tribe");
                    command = "k setkingdom "  + p.getName() + " watertribe";
                    Bukkit.dispatchCommand(console, command);
                    command = "lp user " + p.getName() + " parent add water";

                    if (bender == 3){
                        command = "b choose" + " Water " + p.getName();
                        p.sendMessage(ChatColor.AQUA + "You've been born with the power of Waterbending!");
                        Bukkit.dispatchCommand(console, command);
                    }
                    break;
                case 3:
                    p.sendMessage(ChatColor.GRAY + "You've been sorted into the Air Nation!");
                    command = "k setkingdom " + p.getName() + " airnation";
                    Bukkit.dispatchCommand(console, command);
                    command = "lp user " + p.getName() + " parent add air";
                    Bukkit.dispatchCommand(console, command);
                    command = "b choose" + " Air "  + p.getName();
                    p.sendMessage(ChatColor.GRAY + "You've been born with the power of Airbending!");
                    Bukkit.dispatchCommand(console, command);

                    break;
                case 4:
                case 7:
                    p.sendMessage(ChatColor.RED + "You've been sorted into the Fire Nation!");
                    command = "k setkingdom " + p.getName() + " Vuurnatie";
                    Bukkit.dispatchCommand(console, command);
                    command = "lp user " + p.getName() + " parent add fire";
                    Bukkit.dispatchCommand(console, command);

                    if (bender == 3){
                        command = "b choose" + " Fire " + p.getName().toString();
                        p.sendMessage(ChatColor.RED + "You've been born with the power of Firebending!");
                        Bukkit.dispatchCommand(console, command);
                    }
                    break;
            }
        }
    }
}
