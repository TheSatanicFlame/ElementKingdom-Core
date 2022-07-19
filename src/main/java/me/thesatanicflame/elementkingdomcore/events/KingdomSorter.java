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
            int nationnumber = (int) (Math.random() * 7) + 1;
            int bender = (int) (Math.random() * 3) + 1;

            switch (nationnumber){
                case 1:
                case 5:
                    p.sendMessage(ChatColor.GREEN + "U bent ingedeeld in het Aarderijk!");
                    String command = "k setkingdom " + p.getName() + " Aarderijk";
                    Bukkit.dispatchCommand(console, command);
                    command = "bending choose" + p.getName() + " Earth";
                    if (bender == 3){
                        p.sendMessage("U bent een Earthbender!");
                        Bukkit.dispatchCommand(console, command);
                    }
                    break;
                case 2:
                case 6:
                    p.sendMessage(ChatColor.AQUA + "U bent ingedeeld in de Waterstam!");
                    command = "k setkingdom " + p.getName() + " Waterstam";
                    Bukkit.dispatchCommand(console, command);
                    command = "bending choose" + p.getName() + " Water";
                    if (bender == 3){
                        p.sendMessage("U bent een Waterbender!");
                        Bukkit.dispatchCommand(console, command);
                    }
                    break;
                case 3:
                    p.sendMessage(ChatColor.GRAY + "U bent ingedeeld in het Luchtrijk!");
                    command = "k setkingdom " + p.getName() + " Luchtrijk";
                    Bukkit.dispatchCommand(console, command);
                    command = "bending choose" + p.getName() + " Air";
                    p.sendMessage("U bent een Airbender!");
                    Bukkit.dispatchCommand(console, command);
                    break;
                case 4:
                case 7:
                    p.sendMessage(ChatColor.RED + "U bent ingedeeld in het Vuurnatie!");
                    command = "k setkingdom " + p.getName() + " Vuurnatie";
                    Bukkit.dispatchCommand(console, command);
                    command = "bending choose" + p.getName() + " Fire";
                    if (bender == 3){
                        p.sendMessage("U bent een Firebender!");
                        Bukkit.dispatchCommand(console, command);
                    }
                    break;
            }
        }
    }
}
