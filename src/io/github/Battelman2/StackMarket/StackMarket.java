package io.github.Battelman2.StackMarket;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Battelman2 on 3/2/14.
 */

public class StackMarket extends JavaPlugin
{
    public void onLoad()
    {
        getLogger().info(getDescription().getName() + " has been loaded.");
    }

    public void onEnable()
    {
        getLogger().info(getDescription().getName() + " has been enabled.");
    }

    public void onDisable()
    {
        getLogger().info(getDescription().getName() + " has been disabled.");
    }
}
