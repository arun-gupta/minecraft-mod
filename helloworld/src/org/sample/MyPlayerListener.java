/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 *
 * @author arungup
 */
public class MyPlayerListener implements Listener {
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        System.out.format("{0} logged in", (event.getPlayer().getPlayerListName()));
    }
}
