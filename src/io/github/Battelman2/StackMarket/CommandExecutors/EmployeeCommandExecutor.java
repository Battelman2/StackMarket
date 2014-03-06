package io.github.Battelman2.StackMarket.CommandExecutors;

import io.github.Battelman2.StackMarket.StackMarket;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * Created by Battelman2 on 3/4/14.
 */
public class EmployeeCommandExecutor
{
    public EmployeeCommandExecutor()
    {

    }

    public boolean executeCommand(CommandSender sender, Command cmd, String string, String[] args, StackMarket plugin)
    {

        if(args[0].equalsIgnoreCase("apply"))
        {
            return employee_apply(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("paystub"))
        {
            return employee_paystub(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("quit"))
        {
            return employee_quit(sender, args, plugin);
        }
        else if(args[0].equalsIgnoreCase("shift"))
        {
            return employee_shift(sender, args, plugin);
        }

        return false;
    }

    public boolean employee_apply(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean employee_paystub(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean employee_quit(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }

    public boolean employee_shift(CommandSender sender, String[] args, StackMarket plugin)
    {

        sender.sendMessage(ChatColor.RED + "This command will be implemented in the future.");

        return true;
    }
}
