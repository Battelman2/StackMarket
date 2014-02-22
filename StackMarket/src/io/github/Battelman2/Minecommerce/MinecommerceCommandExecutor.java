package io.github.Battelman2.Minecommerce;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MinecommerceCommandExecutor implements CommandExecutor
{

	public MinecommerceCommandExecutor()
	{
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("sm"))
		{
			// Status Command
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "StackMarket is currently " + ChatColor.GREEN + "ENABLED" + ChatColor.GRAY + " with version " + ChatColor.AQUA + Minecommerce.getVersion() + ChatColor.GRAY + "\nType \"/sm help\" for StackMarket commands.");
				return true;
			}
			// Help Command
			else if(args[0].equalsIgnoreCase("help"))
			{
				if(args.length == 1)
				{
					sender.sendMessage(ChatColor.GOLD + "StackMarket Help:\n" + ChatColor.GRAY + "Showing page 1. Use \"/sm help [n]\" to change pages.\n"
							+ ChatColor.AQUA + "/sm " + ChatColor.GRAY + "Displays status of StackMarket.");
				}
				else if(args.length == 2)
				{
					
				}
			}
			// Invalid Arguments
			else
			{
				sender.sendMessage(ChatColor.DARK_RED + "Invalid argument \'" + args[0] + ChatColor.RED + "\'. Type \"/sm help\" for help with StackMarket.");
			}
		}
		
		return false;
		
	}

}
