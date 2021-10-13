package net.zejzz.dev.anticheataddons;


import me.liwk.karhu.api.KarhuAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class AnticheatAddons extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        KarhuAPI.getEventRegistry().addListener(new BedrockSupport());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}


