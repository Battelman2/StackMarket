package io.github.Battelman2.Minecommerce;

import org.bukkit.plugin.java.JavaPlugin;

public class Minecommerce extends JavaPlugin
{
	
	// Last digit of version number represents build number
	// Build number should be incremented every time the project is exported to jar.
	private static String version;
	
	private MinecommerceCommandExecutor commandExecutor;
	
	@Override
	public void onLoad()
	{
		
	}
	
	@Override
	public void onEnable()
	{
		version = "1.0.0.4";
		
		commandExecutor = new MinecommerceCommandExecutor();
		
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
	
}
