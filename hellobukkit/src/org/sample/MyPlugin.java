package org.sample;



import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Arun Gupta
 */
public final class MyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "{0} plugin enabled", getClass().getName());
        getServer().getPluginManager().registerEvents(new MyPlayerListener(), this);
        
        // This will throw a NullPointException if you don't have the command defined in your plugin.yml file!
	getCommand("basic").setExecutor(new MyPluginCommandExecutor(this));
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "{0} plugin disabled", getClass().getName());
    }
}
