package org.sample.bukkitplugin1;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * @author Arun Gupta
 */
public class MyPlayerListener implements Listener {
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        System.out.format("{0} logged in", (event.getPlayer().getPlayerListName()));
    }
    
    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        
        if (!player.isOp()) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "You are not allowed to break this block");
        }
    }
}
