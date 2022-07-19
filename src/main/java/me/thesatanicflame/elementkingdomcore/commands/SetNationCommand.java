package me.thesatanicflame.elementkingdomcore.commands;

import me.arcaniax.hdb.api.HeadDatabaseAPI;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SetNationCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            HeadDatabaseAPI hdbapi = new HeadDatabaseAPI();
            Player p = (Player) sender;
            if (p.hasPermission("elementkingdom.setnation")){
                if (args.length == 1){
                    Inventory inv = Bukkit.createInventory(p, 27, "Verander de nation van: " + args[0]);

                    ItemStack aarderijk = hdbapi.getItemHead("38211");
                    ItemMeta aarderijkMeta = aarderijk.getItemMeta();
                    aarderijkMeta.setDisplayName(ChatColor.GREEN + "Aarderijk");
                    aarderijk.setItemMeta(aarderijkMeta);
                    inv.setItem(10, aarderijk);





                    p.openInventory(inv);
                } else{
                    p.sendMessage("Usage: /setnation <player>");
                }
            }
        }


        return false;
    }
}
