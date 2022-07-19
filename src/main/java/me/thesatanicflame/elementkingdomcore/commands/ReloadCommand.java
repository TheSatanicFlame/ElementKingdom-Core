package me.thesatanicflame.elementkingdomcore.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class ReloadCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String commandToExecute = "plugman reload ElementKingdom-Core";
            Bukkit.dispatchCommand(console, commandToExecute);
            Player p = (Player) sender;
            p.sendMessage(ChatColor.GREEN + "Plugin reloaded!");
        }
        return false;
    }
}
