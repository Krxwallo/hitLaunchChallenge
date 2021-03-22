package me.justAm0dd3r.hitlaunchchallenge;

import me.justAm0dd3r.hitlaunchchallenge.events.EventListener;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class HitLaunchChallengePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
