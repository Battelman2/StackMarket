package io.github.Battelman2.StackMarket;

import org.bukkit.plugin.java.JavaPlugin;

public class StackMarket extends JavaPlugin
{
	
	private static String version;
	
	// Increment build every time StackMarket is exported to jar. Build # resets for every new released build.
	// Do not increment on push to repository.
	private static String build;
	
	public void onLoad()
	{
		
	}
	
	public void onEnable()
	{
		version = "1.0.0";
		build = "1";
	}
	
	public void onDisable()
	{
		
	}
	
	public static String getVersion()
	{
		return version;
	}
	
	public static String getBuild()
	{
		return build;
	}
	
}
