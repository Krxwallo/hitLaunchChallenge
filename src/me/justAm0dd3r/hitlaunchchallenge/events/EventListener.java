package me.justAm0dd3r.hitlaunchchallenge.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.util.Vector;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent evt) {
        Bukkit.broadcastMessage("Player joined.");
    }

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent evt) {
        if (evt.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_ATTACK)
                || evt.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK)) {
            if (!(evt.getEntity() instanceof Player)) {

                evt.getDamager().setVelocity(new Vector(0, getRandomNumber(1, 3), 0));
            }
        }
    }

    public static double getRandomNumber(int min, int max) {
        return ((Math.random() * (max - min)) + min);
    }

}
