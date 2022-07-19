package me.thesatanicflame.elementkingdomcore.menuHandlers;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class setNationHandler implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        if (ChatColor.translateAlternateColorCodes('&', e.getView().getTitle()).equals(ChatColor.of("#121212").toString() + "Change the nation!") && e.getCurrentItem() != null){
            Player player = (Player) e.getWhoClicked();
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String target = e.getInventory().getItem(4).getItemMeta().getDisplayName().toString();

            e.setCancelled(true);
            switch (e.getRawSlot()){
                case 19:
                    String command = "k setkingdom " + target + " earthkingdom";
                    Bukkit.dispatchCommand(console, command);
                    command = "tellraw " + target + " {\"text\":\"You've been migrated to the Earth Kingdom\",\"color\":\"green\"}";
                    Bukkit.dispatchCommand(console, command);
                    player.sendMessage(ChatColor.GREEN + target + "'s nation has been set to the Earth Kingdom!");
                    break;
                case 21:
                    command = "k setkingdom " + target + " watertribe";
                    Bukkit.dispatchCommand(console, command);
                    command = "tellraw " + target + " {\"text\":\"You've been migrated to the Water Tribe\",\"color\":\"aqua\"}";
                    Bukkit.dispatchCommand(console, command);
                    player.sendMessage(ChatColor.AQUA + target + "'s nation has been set to the Water Tribe!");
                    break;
                case 23:
                    command = "k setkingdom " + target + " airnation";
                    Bukkit.dispatchCommand(console, command);
                    command = "tellraw " + target + " {\"text\":\"You've been migrated to the Air Nation\",\"color\":\"gray\"}";
                    Bukkit.dispatchCommand(console, command);
                    player.sendMessage(ChatColor.GRAY + target + "'s nation has been set to the Air Nation!");
                    break;
                case 25:
                    command = "k setkingdom " + target + " Vuurnatie";
                    Bukkit.dispatchCommand(console, command);
                    command = "tellraw " + target + " {\"text\":\"You've been migrated to the Fire Nation\",\"color\":\"red\"}";
                    Bukkit.dispatchCommand(console, command);
                    player.sendMessage(ChatColor.RED + target + "'s nation has been set to the Fire Nation!");
                    break;
                default:
                    return;
            }


            player.closeInventory();
        }


    }
}
