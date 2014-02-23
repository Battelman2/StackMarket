package io.github.Battelman2.StackMarket;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StackMarketCommandExecutor implements CommandExecutor
{

	public StackMarketCommandExecutor()
	{
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("stackmarket"))
		{
			// Status Command
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "StackMarket is currently " + ChatColor.GREEN + "ENABLED" + ChatColor.GRAY + " with version " + ChatColor.AQUA + StackMarket.getVersion() + ChatColor.GRAY + "\nType \"/sm help\" for StackMarket commands.");
				return true;
			}
			// Help Command
			else if(args[0].equalsIgnoreCase("help"))
			{
				if(args.length == 1)
				{
					sender.sendMessage(ChatColor.GOLD + "StackMarket Help:\n" + ChatColor.GRAY + "Showing page 1 of 1. Use \"/sm help [n]\" to change pages.\n"
							+ ChatColor.AQUA + "/stackmarket " + ChatColor.GRAY + "Displays status of StackMarket.\n"
							+ ChatColor.AQUA + "/business " + ChatColor.GRAY + "Displays all commands for businesses.");
					return true;
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
		
		
		else if(sender instanceof Player && cmd.getName().equalsIgnoreCase("business"))
		{
			
			// Business Statistics
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.DARK_AQUA + "<Business Name> <Business Type>" + ChatColor.DARK_GREEN
						+ "\nOwner(s): " + ChatColor.WHITE + "<owners>" + ChatColor.DARK_GREEN
						+ "\nBank: " + ChatColor.WHITE + "<bank>" + ChatColor.DARK_GREEN
						+ "\nEmployees: " + ChatColor.WHITE + "<employees>");
				return true;
			}
			
			// Business Help
			else if(args[0].equalsIgnoreCase("help") || args[0].equals("?") || args[0].equalsIgnoreCase("h"))
			{
				if(args.length == 1)
				{
					sender.sendMessage(ChatColor.GOLD + "Business Commands:\n"
							+ ChatColor.AQUA + "/biz create " + ChatColor.DARK_AQUA + "<type> <name>" + ChatColor.WHITE + " Creates a new business.\n" + ChatColor.DARK_AQUA + "<type>" + ChatColor.GRAY + " - Business type, use \"LLC\", \"Corporation\", or \"SoleProprietorship\".\n" + ChatColor.DARK_AQUA + "<name>" + ChatColor.GRAY + " - Name of new business.");
					return true;
				}
			}
			
			// Business Create <type> <name>
			else if(args[0].equalsIgnoreCase("create"))
			{
				if(args.length == 1)
				{
					sender.sendMessage(ChatColor.RED + "Missing business <type> and <name>.");
					return false;
				}
				else if(args.length == 2)
				{
					sender.sendMessage(ChatColor.RED + "Missing business <name>.");
					return false;
				}
				else if(args.length == 3)
				{
					if(args[1].equalsIgnoreCase("llc"))
					{
						sender.sendMessage(ChatColor.DARK_AQUA + "Created Business: " + args[2] + " LLC owned by " + sender.getName() + ".");
						return true;
					}
					else if(args[1].equalsIgnoreCase("corporation") || args[1].equalsIgnoreCase("corp"))
					{
						sender.sendMessage(ChatColor.DARK_AQUA + "Created Business: " + args[2] + " Corporation owned by " + sender.getName() + ".");
						return true;
					}
					else if(args[1].equalsIgnoreCase("soleproprietorship") || args[1].equalsIgnoreCase("proprietorship") || args[1].equalsIgnoreCase("sp"))
					{
						sender.sendMessage(ChatColor.DARK_AQUA + "Created Business: " + args[2] + " Sole Proprietorship owned by " + sender.getName() + ".");
						return true;
					}
					else
					{
						sender.sendMessage(ChatColor.RED + "Unrecognized business type. Use \"LLC\", \"Corporation\", or \"SoleProprietorship\".");
						return false;
					}
				}
				else
				{
					sender.sendMessage(ChatColor.RED + "Too Many Arguments.");
					return false;
				}
			}
			
			// Business hire <playername>
			else if(args[0].equalsIgnoreCase("hire"))
			{
				if(args.length == 1)
				{
					sender.sendMessage(ChatColor.RED + "Missing <playername>.");
					return false;
				}
				else if(args.length == 2)
				{
					return false;
				}
				else
				{
					sender.sendMessage(ChatColor.RED + "Too Many Arguments.");
					return false;
				}
					
			}
			
			// Business fire <playername>
			else if(args[0].equalsIgnoreCase("fire"))
			{
				if(args.length == 1)
				{
					sender.sendMessage(ChatColor.RED + "Missing <playername>.");
					return false;
				}
				else if(args.length == 2)
				{
					return false;
				}
				else
				{
					sender.sendMessage(ChatColor.RED + "Too Many Arguments.");
					return false;
				}
			}
			
			// Business claim
			else if(args[0].equalsIgnoreCase("claim"))
			{
				if(args.length == 1)
				{
					return false;
				}
				else
				{
					sender.sendMessage(ChatColor.RED + "Too Many Arguments.");
					return false;
				}
			}
			
			// Business close
			else if(args[0].equalsIgnoreCase("close"))
			{
				if(args.length == 1)
				{
					sender.sendMessage(ChatColor.DARK_AQUA + "Closing Business.");
					return true;
				}
				else
				{
					sender.sendMessage(ChatColor.RED + "Too Many Arguments.");
					return false;
				}
			}
		}
		
		return false;
		
	}

}
