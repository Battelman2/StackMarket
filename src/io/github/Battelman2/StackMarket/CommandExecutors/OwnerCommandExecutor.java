package io.github.Battelman2.StackMarket.CommandExecutors;

import io.github.Battelman2.StackMarket.StackMarket;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * Created by Battelman2 on 3/4/14.
 */
public class OwnerCommandExecutor
{
    public OwnerCommandExecutor()
    {

    }

    public boolean executeCommand(CommandSender sender, Command cmd, String string, String[] args, StackMarket plugin)
    {

        if(args[0].equalsIgnoreCase("create"))
        {
            return owner_create(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("hire"))
        {
            return owner_hire(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("fire"))
        {
            return owner_fire(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("claim"))
        {
            return owner_create(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("unclaim"))
        {
            return owner_unclaim(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("merge"))
        {
            return owner_merge(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("payrate"))
        {
            return owner_payrate(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("paycycle"))
        {
            return owner_paycycle(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("bonus"))
        {
            return owner_bonus(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("shares"))
        {
            return owner_shares(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("hours"))
        {
            return owner_hours(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("promote"))
        {
            return owner_promote(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("demote"))
        {
            return owner_demote(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("hiring"))
        {
            return owner_hiring(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("job"))
        {
            return owner_job(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("owner"))
        {
            return owner_owner(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("close"))
        {
            return owner_close(sender, args, plugin);
        }


        return false;
    }

    public boolean owner_create(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_hire(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_fire(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_claim(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_unclaim(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_merge(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_payrate(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_paycycle(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_bonus(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_shares(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_hours(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_promote(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_demote(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_hiring(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_job(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_owner(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean owner_close(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }
}
