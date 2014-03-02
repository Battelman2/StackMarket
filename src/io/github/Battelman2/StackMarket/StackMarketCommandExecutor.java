package io.github.Battelman2.StackMarket;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Battelman2 on 3/2/14.
 */

public class StackMarketCommandExecutor implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args)
    {

        if(cmd.getName().equalsIgnoreCase("stackmarket"))
        {

            if(args.length == 0)
            {
                sender.sendMessage(ChatColor.GRAY + "StackMarket is currently " + ChatColor.GREEN + "ENABLED" + ChatColor.GRAY + " with version " + ChatColor.AQUA + "1.0.0" + ChatColor.GRAY + "\nType \"/sm help\" for StackMarket commands.");
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

            /**
             * Command: /business [name]
             * Description: View information of a business. Shows sender's business if not specified.
             */
            if(args.length == 0)
            {
                sender.sendMessage(ChatColor.DARK_AQUA + "<Business Name> <Business Type>" + ChatColor.DARK_GREEN
                        + "\nOwner(s): " + ChatColor.WHITE + "<owners>" + ChatColor.DARK_GREEN
                        + "\nBank: " + ChatColor.WHITE + "<bank>" + ChatColor.DARK_GREEN
                        + "\nEmployees: " + ChatColor.WHITE + "<employees>");
                return true;
            }

            /**
             * Command: /business help [n]
             * Description: Display business commands.
             */
            else if(args[0].equalsIgnoreCase("help") || args[0].equals("?") || args[0].equalsIgnoreCase("h"))
            {
                if(args.length == 1)
                {
                    sender.sendMessage(ChatColor.GOLD + "Business Commands:\n"
                            + ChatColor.AQUA + "/biz create " + ChatColor.DARK_AQUA + "<type> <name>" + ChatColor.WHITE + " Creates a new business.\n" + ChatColor.DARK_AQUA + "<type>" + ChatColor.GRAY + " - Business type, use \"LLC\", \"Corporation\", or \"SoleProprietorship\".\n" + ChatColor.DARK_AQUA + "<name>" + ChatColor.GRAY + " - Name of new business.\n"
                            + ChatColor.AQUA + "/biz hire " + ChatColor.DARK_AQUA + "<playername>" + ChatColor.WHITE + " Offers the player a job in your business.\n" + ChatColor.DARK_AQUA + "<playername>" + ChatColor.GRAY + " - Any real player's name. Player must be online.");
                    return true;
                }
            }

            /**
             * Command: /business create <type> <name>
             * Description: Creates a new business
             */
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
                    else if(args[1].equalsIgnoreCase("soleproprietorship") || args[1].equalsIgnoreCase("proprietorship") || args[1].equalsIgnoreCase("sp") || args[1].equalsIgnoreCase("sole"))
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

            /**
             * Command: /business hire <playername>
             * Description: Offers the player a job in the company.
             */
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

            /**
             * Command: /business fire <playername>
             * Description: Fires the player from the business.
             */
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

            /**
             * Command: /business claim
             * Description: Claims the chunk (if unclaimed) for the business
             */
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

            /**
             * Command: /business unclaim
             * Description: Returns the claimed chunk to wilderness property.
             */
            else if(args[0].equalsIgnoreCase("unclaim"))
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

            /**
             * Command: /business close
             * Description: Deletes the business.
             */
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

            /**
             * Command: /business owner <action>
             * Description: Manages ownership of business.
             * Sub-Commands: set, add, remove
             */
            else if(args[0].equalsIgnoreCase("owner"))
            {

            }
        }

        return false;
    }
}
