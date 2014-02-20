package io.github.Battelman2.StackMarket;

import org.bukkit.plugin.java.JavaPlugin;

public class StackMarket extends JavaPlugin
{
	
	private static String version;
	
	// Increment build each time after exporting to jar. Build # resets for every new build.
	// Do not increment on push to repository.
	private static String build;
	
	private StackMarketCommandExecutor commandExecutor;
	
	@Override
	public void onLoad()
	{
		
	}
	
	@Override
	public void onEnable()
	{
		version = "1.0.0";
		build = "4";
		
		commandExecutor = new StackMarketCommandExecutor();
		
		getCommand("sm").setExecutor(commandExecutor);
	}
	
	@Override
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
