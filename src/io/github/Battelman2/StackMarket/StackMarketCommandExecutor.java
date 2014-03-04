package io.github.Battelman2.StackMarket;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * Created by Battelman2 on 3/2/14.
 */

public class StackMarketCommandExecutor implements CommandExecutor
{

    private StackMarket plugin;

    public StackMarketCommandExecutor(StackMarket _plugin)
    {
        plugin = _plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args)
    {

        if(cmd.getName().equalsIgnoreCase("stackmarket"))
        {
            if(args.length > 0)
            {
                if(args[0].equalsIgnoreCase("help"))
                {
                    return this.help(sender, args);
                }
                else if(args[0].equalsIgnoreCase("create"))
                {
                    return this.create(sender, args);
                }
            }
        }

        return false;
    }

    // Command Sub-Methods

    public boolean help(CommandSender sender, String args[])
    {
        if (args.length == 1)
        {
            sender.sendMessage(ChatColor.GOLD + "- StackMarket Help -");
            sender.sendMessage(ChatColor.DARK_GREEN + "Use " + ChatColor.AQUA + "/biz help <command>" + ChatColor.DARK_GREEN + " for more on that command.");
            sender.sendMessage(ChatColor.GRAY + "<argument> is required where [argument] is optional.");
            sender.sendMessage(ChatColor.AQUA + "/biz help" + ChatColor.DARK_AQUA + " [command]" + ChatColor.GRAY + " Displays StackMarket Commands.");
            sender.sendMessage(ChatColor.AQUA + "/biz create" + ChatColor.DARK_AQUA + " <name> <type>" + ChatColor.GRAY + " Creates a new business.");

            return true;
        }
        else
        {
            if (args[1].equalsIgnoreCase("help"))
            {
                sender.sendMessage(ChatColor.AQUA + "Usage: " + ChatColor.GRAY + "/biz help [command]");
                sender.sendMessage(ChatColor.AQUA + "Description: " + ChatColor.GRAY + "Displays commands for StackMarket.");
                sender.sendMessage(ChatColor.AQUA + "Arguments:");
                sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "[command] - " + ChatColor.GRAY + "Command to display.");

                return true;

            }
            else if (args[1].equalsIgnoreCase("create"))
            {
                sender.sendMessage(ChatColor.AQUA + "Usage: " + ChatColor.GRAY + "/biz create <name> <type>");
                sender.sendMessage(ChatColor.AQUA + "Description: " + ChatColor.GRAY + "Creates a new business belonging to command sender.");
                sender.sendMessage(ChatColor.AQUA + "Arguments:");
                sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "<name> - " + ChatColor.GRAY + "Name of business.");
                sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "<type> - " + ChatColor.GRAY + "Type of business. See all types below.");
                sender.sendMessage(ChatColor.GRAY + "  - " + ChatColor.DARK_GREEN + "\"Sole\": " + ChatColor.GRAY + "A Sole Proprietorship is the most basic business. It belongs to a single owner, the president, and does not interact with the stock market.");
                sender.sendMessage(ChatColor.GRAY + "  - " + ChatColor.DARK_GREEN + "\"LLC\": " + ChatColor.GRAY + "A Limited Liability Company is essentially a Sole Proprietorship with multiple owners. Up to 3 owners can own the LLC equally in a partnership.");
                sender.sendMessage(ChatColor.GRAY + "  - " + ChatColor.DARK_GREEN + "\"Corp\": " + ChatColor.GRAY + "A Corporation can, but doesn't have to, exist in the stock market. The owner (CEO) at any given time is the player with the most shares of said Corporation.");

                return true;
            }
            else
            {
                sender.sendMessage(ChatColor.RED + "Unrecognized command. See " + ChatColor.AQUA + "/biz help " + ChatColor.RED + "for list of commands.");
                return false;
            }
        }
    }

    public boolean create(CommandSender sender, String[] args)
    {
        if(args.length == 3)
        {
            if(sender instanceof Player)
            {
                if(args[2].equalsIgnoreCase("sole"))
                {
                    Business dbbiz = Business.getLandFromDatabaseUsingName(args[1]);

                    if(dbbiz != null)
                    {
                        sender.sendMessage(ChatColor.RED + "That name is already taken.");
                        return true;
                    }

                    Business biz = Business.businessFromProperties(args[1], Business.types.SOLEPROPRIETORSHIP.getTypeInt());
                    StackMarket.plugin().getDatabase().save(biz);
                    sender.sendMessage(ChatColor.DARK_AQUA + "Created new business.");

                    return true;

                }
                else if(args[2].equalsIgnoreCase("llc"))
                {
                    Business dbbiz = Business.getLandFromDatabaseUsingName(args[1]);

                    if(dbbiz != null)
                    {
                        sender.sendMessage(ChatColor.RED + "That name is already taken.");
                        return true;
                    }

                    Business biz = Business.businessFromProperties(args[1], Business.types.LIMITEDLIABILITYCOMPANY.getTypeInt());
                    StackMarket.plugin().getDatabase().save(biz);
                    sender.sendMessage(ChatColor.DARK_AQUA + "Created new business.");

                    return true;
                }
                else if(args[2].equalsIgnoreCase("corp"))
                {
                    Business dbbiz = Business.getLandFromDatabaseUsingName(args[1]);

                    if(dbbiz != null)
                    {
                        sender.sendMessage(ChatColor.RED + "That name is already taken.");
                        return true;
                    }

                    Business biz = Business.businessFromProperties(args[1], Business.types.CORPORATION.getTypeInt());
                    StackMarket.plugin().getDatabase().save(biz);
                    sender.sendMessage(ChatColor.DARK_AQUA + "Created new business.");

                    return true;
                }
                else
                {
                    sender.sendMessage(ChatColor.RED + "Unknown business type. Use \"sole\", \"llc\", or \"corp\".");
                }
            }
        }
        return false;
    }

}
