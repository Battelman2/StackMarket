package io.github.Battelman2.StackMarket;


import io.github.Battelman2.StackMarket.CommandExecutors.*;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by Battelman2 on 3/2/14.
 */

public class StackMarketCommandDirector implements CommandExecutor
{

    private StackMarket plugin;
    private AdminCommandExecutor adminCommandExecutor;
    private EmployeeCommandExecutor employeeCommandExecutor;
    private GeneralCommandExecutor generalCommandExecutor;
    private OwnerCommandExecutor ownerCommandExecutor;

    public StackMarketCommandDirector(StackMarket _plugin)
    {
        plugin = _plugin;
        adminCommandExecutor = new AdminCommandExecutor();
        employeeCommandExecutor = new EmployeeCommandExecutor();
        generalCommandExecutor = new GeneralCommandExecutor();
        ownerCommandExecutor = new OwnerCommandExecutor();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args)
    {

        if(cmd.getName().equalsIgnoreCase("stackmarket"))
        {


            if(args.length > 0)
            {


                if(args[0].equalsIgnoreCase("changeowner") || args[0].equalsIgnoreCase("changetype") || args[0].equalsIgnoreCase("changeowner") || args[0].equalsIgnoreCase("fine") || args[0].equalsIgnoreCase("closebusiness"))
                {

                    return adminCommandExecutor.executeCommand(sender, cmd, string, args, plugin);

                }
                if(args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("globalstats") || args[0].equalsIgnoreCase("list") || args[0].equalsIgnoreCase("buy") || args[0].equalsIgnoreCase("payinvoice") || args[0].equalsIgnoreCase("acceptshares") || args[0].equalsIgnoreCase("resume") || args[0].equalsIgnoreCase("stats") || args[0].equalsIgnoreCase("types") || args[0].equalsIgnoreCase("merging"))
                {

                    return generalCommandExecutor.executeCommand(sender, cmd, string, args, plugin);

                }
                if(args[0].equalsIgnoreCase("create") || args[0].equalsIgnoreCase("hire") || args[0].equalsIgnoreCase("fire") || args[0].equalsIgnoreCase("claim") || args[0].equalsIgnoreCase("unclaim") || args[0].equalsIgnoreCase("merge") || args[0].equalsIgnoreCase("payrate") || args[0].equalsIgnoreCase("paycycle") || args[0].equalsIgnoreCase("bonus") || args[0].equalsIgnoreCase("shares") || args[0].equalsIgnoreCase("hours") || args[0].equalsIgnoreCase("promote") || args[0].equalsIgnoreCase("demote") || args[0].equalsIgnoreCase("hiring") || args[0].equalsIgnoreCase("job") || args[0].equalsIgnoreCase("owner") || args[0].equalsIgnoreCase("close"))
                {

                    return ownerCommandExecutor.executeCommand(sender, cmd, string, args, plugin);

                }
                if(args[0].equalsIgnoreCase("apply") || args[0].equalsIgnoreCase("paystub") || args[0].equalsIgnoreCase("quit") || args[0].equalsIgnoreCase("shift"))
                {

                    return employeeCommandExecutor.executeCommand(sender, cmd, string, args, plugin);

                }

                sender.sendMessage(ChatColor.RED + "Unrecognized command. Refer to " + ChatColor.AQUA + "/biz help" + ChatColor.RED + " for available commands.");
                return true;


            }
            else
            {

                sender.sendMessage(ChatColor.GRAY + plugin.getDescription().getName() + " is " + ChatColor.GREEN + "ENABLED" + ChatColor.GRAY + " with version " + ChatColor.AQUA +  plugin.getDescription().getVersion());
                sender.sendMessage(ChatColor.GRAY + "See " + ChatColor.AQUA + "/biz help" + ChatColor.GRAY + " for available commands.");

                return true;
            }


        }

        return false;
    }
}
