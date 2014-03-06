package io.github.Battelman2.StackMarket.CommandExecutors;

import io.github.Battelman2.StackMarket.StackMarket;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * Created by Battelman2 on 3/4/14.
 */
public class AdminCommandExecutor
{

    public AdminCommandExecutor()
    {

    }

    public boolean executeCommand(CommandSender sender, Command cmd, String string, String[] args, StackMarket plugin)
    {

        if(args[0].equalsIgnoreCase("changeowner"))
        {
            return admin_changeowner(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("changetype"))
        {
            return admin_changetype(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("fine"))
        {
            return admin_fine(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("closebusiness"))
        {
            return admin_closebusiness(sender, args, plugin);
        }

        return false;
    }


    public boolean admin_changeowner(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean admin_changetype(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean admin_fine(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean admin_closebusiness(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }


}
