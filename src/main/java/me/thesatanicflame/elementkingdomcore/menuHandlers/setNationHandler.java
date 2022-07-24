package me.thesatanicflame.elementkingdomcore.menuHandlers;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class setNationHandler implements Listener {

    String[] elements = {"earth", "water", "air", "fire"};
    @EventHandler
    public void onClick(InventoryClickEvent e){
        if (ChatColor.translateAlternateColorCodes('&', e.getView().getTitle()).equals(ChatColor.of("#121212").toString() + "Change the nation!") && e.getCurrentItem() != null){
            Player player = (Player) e.getWhoClicked();
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String target = e.getInventory().getItem(4).getItemMeta().getDisplayName().toString();
            String command;

            e.setCancelled(true);
            switch (e.getRawSlot()){
                case 19:
                    for (String element : elements){
                        command = "lp user " + player.getName() + " parent remove " + element;
                        Bukkit.dispatchCommand(console, command);
                    }
                    command = "k setkingdom " + target + " earthkingdom";
                    Bukkit.dispatchCommand(console, command);
                    command = "tellraw " + target + " {\"text\":\"You've been migrated to the Earth Kingdom\",\"color\":\"green\"}";
                    Bukkit.dispatchCommand(console, command);
                    player.sendMessage(ChatColor.GREEN + target + "'s nation has been set to the Earth Kingdom!");
                    command = "lp user " + player.getName() + " parent add earth";
                    Bukkit.dispatchCommand(console, command);
                    break;
                case 21:
                    for (String element : elements){
                        command = "lp user " + player.getName() + " parent remove " + element;
                        Bukkit.dispatchCommand(console, command);
                    }
                    command = "k setkingdom " + target + " watertribe";
                    Bukkit.dispatchCommand(console, command);
                    command = "tellraw " + target + " {\"text\":\"You've been migrated to the Water Tribe\",\"color\":\"aqua\"}";
                    Bukkit.dispatchCommand(console, command);
                    player.sendMessage(ChatColor.AQUA + target + "'s nation has been set to the Water Tribe!");
                    command = "lp user " + player.getName() + " parent add water";
                    Bukkit.dispatchCommand(console, command);
                    break;
                case 23:
                    for (String element : elements){
                        command = "lp user " + player.getName() + " parent remove " + element;
                        Bukkit.dispatchCommand(console, command);
                    }
                    command = "k setkingdom " + target + " airnation";
                    Bukkit.dispatchCommand(console, command);
                    command = "tellraw " + target + " {\"text\":\"You've been migrated to the Air Nation\",\"color\":\"gray\"}";
                    Bukkit.dispatchCommand(console, command);
                    player.sendMessage(ChatColor.GRAY + target + "'s nation has been set to the Air Nation!");
                    command = "lp user " + player.getName() + " parent add air";
                    Bukkit.dispatchCommand(console, command);
                    break;
                case 25:
                    for (String element : elements){
                        command = "lp user " + player.getName() + " parent remove " + element;
                        Bukkit.dispatchCommand(console, command);
                    }
                    command = "k setkingdom " + target + " Vuurnatie";
                    Bukkit.dispatchCommand(console, command);
                    command = "tellraw " + target + " {\"text\":\"You've been migrated to the Fire Nation\",\"color\":\"red\"}";
                    Bukkit.dispatchCommand(console, command);
                    player.sendMessage(ChatColor.RED + target + "'s nation has been set to the Fire Nation!");
                    command = "lp user " + player.getName() + " parent add fire";
                    Bukkit.dispatchCommand(console, command);
                    break;
                default:
                    return;
            }


            player.closeInventory();
        }


    }
}
