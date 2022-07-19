package me.thesatanicflame.elementkingdomcore.commands;

import me.arcaniax.hdb.api.HeadDatabaseAPI;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class SetNationCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            HeadDatabaseAPI hdbapi = new HeadDatabaseAPI();
            Player p = (Player) sender;
            if (p.hasPermission("elementkingdom.setnation")){
                if (args.length == 1){
                    //Maak inv aan voor het selecteren van de nation.\
                    Inventory inv = Bukkit.createInventory(p, 36, ChatColor.of("#121212") + "Change the nation!");
                    //Makes items for in the inventory
                    ItemStack player = new ItemStack(Material.PLAYER_HEAD);
                    SkullMeta playermeta = (SkullMeta) player.getItemMeta();
                    playermeta.setOwningPlayer(Bukkit.getOfflinePlayer(args[0]));
                    playermeta.setDisplayName(args[0]);
                    player.setItemMeta(playermeta);



                    ItemStack aarderijk = hdbapi.getItemHead("14230");
                    ItemMeta aarderijkMeta = aarderijk.getItemMeta();
                    aarderijkMeta.setDisplayName(ChatColor.GREEN + "Earth Kingdom");
                    aarderijk.setItemMeta(aarderijkMeta);
                    ItemStack waterstam = hdbapi.getItemHead("39387");
                    ItemMeta waterstamMeta = waterstam.getItemMeta();
                    waterstamMeta.setDisplayName(ChatColor.AQUA + "Water Tribe");
                    waterstam.setItemMeta(waterstamMeta);
                    ItemStack Luchtrijk = hdbapi.getItemHead("39383");
                    ItemMeta LuchtrijkMeta = Luchtrijk.getItemMeta();
                    LuchtrijkMeta.setDisplayName(ChatColor.GRAY + "Air Nation");
                    Luchtrijk.setItemMeta(LuchtrijkMeta);
                    ItemStack Vuurnatie = hdbapi.getItemHead("40501");
                    ItemMeta VuurnatieMeta = Vuurnatie.getItemMeta();
                    VuurnatieMeta.setDisplayName(ChatColor.RED + "Fire Nation");
                    Vuurnatie.setItemMeta(VuurnatieMeta);

                    //Sets items on slots
                    inv.setItem(19, aarderijk);
                    inv.setItem(21, waterstam);
                    inv.setItem(23, Luchtrijk);
                    inv.setItem(25, Vuurnatie);
                    inv.setItem(4, player);

                    p.openInventory(inv);
                } else{
                    p.sendMessage("Usage: /setnation <player>");
                }
            }
        }


        return false;
    }
}
