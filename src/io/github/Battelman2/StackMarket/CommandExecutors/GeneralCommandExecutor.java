package io.github.Battelman2.StackMarket.CommandExecutors;

import io.github.Battelman2.StackMarket.Business;
import io.github.Battelman2.StackMarket.StackMarket;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * Created by Battelman2 on 3/4/14.
 */
public class GeneralCommandExecutor
{
    public GeneralCommandExecutor()
    {

    }

    public boolean executeCommand(CommandSender sender, Command cmd, String string, String[] args, StackMarket plugin)
    {

        if(args[0].equalsIgnoreCase("help"))
        {
            return general_help(sender, args);
        }
        else if(args[0].equalsIgnoreCase("globalstats"))
        {
            return general_globalstats(sender, plugin);
        }
        else if(args[0].equalsIgnoreCase("list"))
        {
            return general_list(sender, args, plugin);
        }

        return false;
    }

    // General Command Sub-Methods

    public boolean general_help(CommandSender sender, String[] args)
    {
        if(args.length == 1)
        {

            sender.sendMessage(ChatColor.GOLD + "- StackMarket Commands -");
            sender.sendMessage(ChatColor.GOLD + "To see command categories, use the following.");
            sender.sendMessage(ChatColor.AQUA + "/biz help admin" + ChatColor.GOLD + " for server admin commands.");
            sender.sendMessage(ChatColor.AQUA + "/biz help general" + ChatColor.GOLD + " for general player commands.");
            sender.sendMessage(ChatColor.AQUA + "/biz help owner" + ChatColor.GOLD + " for business owner commands.");
            sender.sendMessage(ChatColor.AQUA + "/biz help employee" + ChatColor.GOLD + " for business employee commands.");

            return true;
        }
        else if(args.length == 2)
        {
            if(args[1].equalsIgnoreCase("admin"))
            {

                sender.sendMessage(ChatColor.GOLD + "- StackMarket Admin Commands -");
                sender.sendMessage(ChatColor.GOLD + "List of commands under Admin category.");
                sender.sendMessage(ChatColor.AQUA + "/biz changeowner " + ChatColor.DARK_AQUA +"<business> <newowner> [removedowner]" + ChatColor.GOLD + " Change a business' owner.");
                sender.sendMessage(ChatColor.AQUA + "/biz changetype " + ChatColor.DARK_AQUA +"<business> <newtype>" + ChatColor.GOLD + " Change a business' type.");
                sender.sendMessage(ChatColor.AQUA + "/biz fine " + ChatColor.DARK_AQUA +"<business> <amount>" + ChatColor.GOLD + " Fine a business a fee.");
                sender.sendMessage(ChatColor.AQUA + "/biz closebusiness " + ChatColor.DARK_AQUA +"<business>" + ChatColor.GOLD + " Closes and deletes a business.");

                return true;
            }
            else if(args[1].equalsIgnoreCase("general"))
            {

                sender.sendMessage(ChatColor.GOLD + "- StackMarket General Commands -");
                sender.sendMessage(ChatColor.GOLD + "List of commands under General category.");
                sender.sendMessage(ChatColor.AQUA + "/biz help " + ChatColor.DARK_AQUA +"[category]" + ChatColor.GOLD + " View StackMarket commands.");
                sender.sendMessage(ChatColor.AQUA + "/biz globalstats " + ChatColor.GOLD + " View server-wide business stats.");
                sender.sendMessage(ChatColor.AQUA + "/biz list " + ChatColor.DARK_AQUA +"[page]" + ChatColor.GOLD + " View list of businesses.");
                sender.sendMessage(ChatColor.AQUA + "/biz buy " + ChatColor.DARK_AQUA +"<business> <offer>" + ChatColor.GOLD + " Offer to buy a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz payinvoice " + ChatColor.DARK_AQUA +"<ID>" + ChatColor.GOLD + " Pay an invoice to a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz acceptshares " + ChatColor.DARK_AQUA +"<company> [qty]" + ChatColor.GOLD + " Accept a private stock transaction.");
                sender.sendMessage(ChatColor.AQUA + "/biz resume " + ChatColor.DARK_AQUA +"<player> [add/remove] [section]" + ChatColor.GOLD + " View or edit a player's resume.");
                sender.sendMessage(ChatColor.AQUA + "/biz stats " + ChatColor.DARK_AQUA +"[business]" + ChatColor.GOLD + " View a business' information.");
                sender.sendMessage(ChatColor.AQUA + "/biz types " + ChatColor.GOLD + " View accepted business types.");
                sender.sendMessage(ChatColor.AQUA + "/biz merging " + ChatColor.GOLD + " View information about merging businesses.");



                return true;
            }
            else if(args[1].equalsIgnoreCase("owner"))
            {

                sender.sendMessage(ChatColor.GOLD + "- StackMarket Owner Commands -");
                sender.sendMessage(ChatColor.GOLD + "List of commands under Owner category.");
                sender.sendMessage(ChatColor.AQUA + "/biz create " + ChatColor.DARK_AQUA +"<business> <type>" + ChatColor.GOLD + " Create a new business.");
                sender.sendMessage(ChatColor.AQUA + "/biz hire " + ChatColor.DARK_AQUA +"<player>" + ChatColor.GOLD + " Offer a job to a player.");
                sender.sendMessage(ChatColor.AQUA + "/biz fire " + ChatColor.DARK_AQUA +"<player>" + ChatColor.GOLD + " Fire a player immediately.");
                sender.sendMessage(ChatColor.AQUA + "/biz claim " + ChatColor.GOLD + " Claim land for a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz unclaim " + ChatColor.GOLD + " Unclaim land for a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz merge " + ChatColor.DARK_AQUA +"<business>" + ChatColor.GOLD + " See \"/biz merging\" for info.");
                sender.sendMessage(ChatColor.AQUA + "/biz payrate " + ChatColor.DARK_AQUA +"<rank> <amount per hour>" + ChatColor.GOLD + " Set a wage for a rank.");
                sender.sendMessage(ChatColor.AQUA + "/biz paycycle " + ChatColor.DARK_AQUA +"<hour/day/week/month>" + ChatColor.GOLD + " Set payment distribution.");
                sender.sendMessage(ChatColor.AQUA + "/biz bonus " + ChatColor.DARK_AQUA +"<player> <amount>" + ChatColor.GOLD + " Pay a one time bonus to a player.");
                sender.sendMessage(ChatColor.AQUA + "/biz shares " + ChatColor.DARK_AQUA +"<give/sell> <player> <qty>" + ChatColor.GOLD + " Sell or give a player shares.");
                sender.sendMessage(ChatColor.AQUA + "/biz hours " + ChatColor.DARK_AQUA +"<open/close/always> [militarytime]" + ChatColor.GOLD + " Set opening/closing hours.");
                sender.sendMessage(ChatColor.AQUA + "/biz promote " + ChatColor.DARK_AQUA +"<player> [torank]" + ChatColor.GOLD + " Promote a player in a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz demote " + ChatColor.DARK_AQUA +"<player> [torank]" + ChatColor.GOLD + " Demote a player in a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz hiring " + ChatColor.DARK_AQUA +"<yes/no>" + ChatColor.GOLD + " Toggle hiring state of a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz job " + ChatColor.DARK_AQUA +"<offer/reject/rejectall> [player]" + ChatColor.GOLD + " Manage job opportunities.");
                sender.sendMessage(ChatColor.AQUA + "/biz owner " + ChatColor.DARK_AQUA +"<add/set/remove> <player>" + ChatColor.GOLD + " Manage business owners.");
                sender.sendMessage(ChatColor.AQUA + "/biz close " + ChatColor.DARK_AQUA +"confirm" + ChatColor.GOLD + " Close and delete a business.");


                return true;
            }
            else if(args[1].equalsIgnoreCase("employee"))
            {

                sender.sendMessage(ChatColor.GOLD + "- StackMarket Employee Commands -");
                sender.sendMessage(ChatColor.GOLD + "List of commands under Employee category.");
                sender.sendMessage(ChatColor.AQUA + "/biz apply " + ChatColor.DARK_AQUA +"<business>" + ChatColor.GOLD + " Apply for a job at a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz paystub " + ChatColor.DARK_AQUA +"[employee]" + ChatColor.GOLD + " View employment statistics.");
                sender.sendMessage(ChatColor.AQUA + "/biz quit " + ChatColor.DARK_AQUA +"-confirm" + ChatColor.GOLD + " Leave a business.");
                sender.sendMessage(ChatColor.AQUA + "/biz shift " + ChatColor.DARK_AQUA +"[start/end] [business]" + ChatColor.GOLD + " Manage current shift.");

                return true;
            }
            else
            {

                sender.sendMessage(ChatColor.RED + "Unrecognized help category. See " + ChatColor.AQUA + "/biz help" + ChatColor.RED + " for categories.");

                return true;
            }


        }
        else
        {

            sender.sendMessage(ChatColor.RED + "Too many arguments. See " + ChatColor.AQUA + "/biz help" + ChatColor.RED + " for help.");

            return true;
        }

    }

    public boolean general_globalstats(CommandSender sender, StackMarket plugin)
    {

            sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

            return true;
    }

    public boolean general_list(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean general_buy(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean general_payinvoice(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }
}
