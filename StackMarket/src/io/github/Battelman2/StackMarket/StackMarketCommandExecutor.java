package io.github.Battelman2.StackMarket;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StackMarketCommandExecutor implements CommandExecutor
{

	public StackMarketCommandExecutor()
	{
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("sm"))
		{
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "StackMarket is currently " + ChatColor.GREEN + "ENABLED" + ChatColor.GRAY + " with version " + ChatColor.AQUA + StackMarket.getVersion() + ChatColor.GRAY + " build " + ChatColor.AQUA + StackMarket.getBuild());
				return true;
			}
		}
		
		return false;
		
	}

}
