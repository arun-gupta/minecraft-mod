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
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "{0} plugin disabled", getClass().getName());
    }
}
