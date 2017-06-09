package com.sharkbait.parrotride;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("ParrotRider enabled!");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("ParrotRider disabled!");
    }

    @EventHandler
    public void onInteract(final PlayerInteractAtEntityEvent ev) {
        if (ev.getRightClicked().getType() == EntityType.valueOf("PARROT")) {
            ev.getRightClicked().addPassenger((Entity)ev.getPlayer());
        }
    }
}
