package org.sample.bukkitplugin1;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * @author Arun Gupta
 */
public class MyPlayerListener implements Listener {
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        System.out.format("{0} logged in", (event.getPlayer().getPlayerListName()));
    }
}
