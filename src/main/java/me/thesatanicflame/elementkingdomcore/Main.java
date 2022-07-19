package me.thesatanicflame.elementkingdomcore;

import me.thesatanicflame.elementkingdomcore.commands.SetNationCommand;
import me.thesatanicflame.elementkingdomcore.events.KingdomSorter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new KingdomSorter(), this);
        getCommand("setnation").setExecutor(new SetNationCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
