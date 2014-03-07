package io.github.Battelman2.StackMarket.CommandExecutors;

import io.github.Battelman2.StackMarket.Business;
import io.github.Battelman2.StackMarket.Employee;
import io.github.Battelman2.StackMarket.Ranks;
import io.github.Battelman2.StackMarket.StackMarket;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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

        if(sender instanceof Player)
        {

            if(args.length == 3)
            {

                if(args[2].equalsIgnoreCase("sole"))
                {

                    if(args[1].matches("^[a-zA-Z0-9]*$"))
                    {

                        Business compare = Business.getBusinessFromDatabaseUsingName(args[1]);

                        if (compare == null)
                        {

                            Business newBiz = Business.businessFromProperties(args[1], Business.types.SOLEPROPRIETORSHIP.getTypeInt());

                            plugin.getDatabase().save(newBiz);

                            Bukkit.getServer().broadcastMessage(ChatColor.GREEN + sender.getName() + " has just created " + args[1] + " Sole Proprietorship!");

                            Employee newEmployee = Employee.employeeFromProperties(newBiz.getId(), true, sender.getName(), Ranks.OWNER.getDbname());

                            sender.sendMessage(ChatColor.DARK_AQUA + "You are now the owner of " + args[1] + " Sole Proprietorship. You are now on shift.");

                            return true;

                        }
                        else
                        {

                            sender.sendMessage(ChatColor.RED + args[1] + " already exists. Try using a different name.");

                            return true;
                        }

                    }
                    else
                    {

                        sender.sendMessage(ChatColor.RED + "Business names can only use letters and numbers.");

                        return true;
                    }

                }
                else if(args[2].equalsIgnoreCase("llc"))
                {
                    return true;
                }
                else if(args[2].equalsIgnoreCase("corp"))
                {
                    return true;
                }
                else
                {
                    sender.sendMessage(ChatColor.RED + "Unrecognized business type. See " + ChatColor.AQUA + "/biz types" + ChatColor.RED + " for information.");
                    return true;
                }

            }
            else
            {
                sender.sendMessage(ChatColor.RED + "Invalid arguments. See " + ChatColor.AQUA + "/biz help owner" + ChatColor.RED + " for help.");
                return true;
            }
        }
        else
        {

            sender.sendMessage(ChatColor.RED + "This command can only be executed by players.");

            return true;
        }
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
