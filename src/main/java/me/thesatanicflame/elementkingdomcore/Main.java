package me.thesatanicflame.elementkingdomcore;

import me.thesatanicflame.elementkingdomcore.commands.SetNationCommand;
import me.thesatanicflame.elementkingdomcore.events.KingdomSorter;
import me.thesatanicflame.elementkingdomcore.menuHandlers.setNationHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new KingdomSorter(), this);
        Bukkit.getPluginManager().registerEvents(new setNationHandler(), this);
        getCommand("setnation").setExecutor(new SetNationCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
