package io.github.Battelman2.StackMarket;

import com.avaje.ebean.EbeanServer;
import com.lennardf1989.bukkitex.MyDatabase;
import org.bukkit.configuration.Configuration;
import org.bukkit.plugin.java.JavaPlugin;
import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Battelman2 on 3/2/14.
 */

public class StackMarket extends JavaPlugin
{

    private static StackMarket plugin;

    private int numBusinesses;
    private int numEmployees;
    private int numJobs;

    private MyDatabase database;

    public void onLoad()
    {
        getLogger().info(getDescription().getName() + " has been loaded with version " + getDescription().getVersion());
    }

    public void onEnable()
    {
        this.saveDefaultConfig();

        plugin = this;

        getLogger().info(getDescription().getName() + " is loading its database. Ignore messages between now and completion.");
        setupDatabase();

        StackMarketCommandDirector commandExecutor = new StackMarketCommandDirector(this);

        getCommand("stackmarket").setExecutor(commandExecutor);

        getLogger().info(getDescription().getName() + " has been enabled.");
    }

    public void onDisable()
    {
        getLogger().info(getDescription().getName() + " has been disabled.");
    }

    public static StackMarket plugin()
    {
        return plugin;
    }

    private void setupDatabase()
    {
        Configuration config = getConfig();

        database = new MyDatabase(this)
        {
            protected java.util.List<Class<?>> getDatabaseClasses()
            {
                List<Class<?>> list = new ArrayList<Class<?>>();
                list.add(Business.class);
                list.add(Employee.class);
                list.add(ClaimedLand.class);
                list.add(Stock.class);
                list.add(Share.class);

                return list;
            };
        };

        database.initializeDatabase(
                config.getString("database.driver","org.sqlite.JDBC"),
                config.getString("database.url","jdbc:sqlite:{DIR}{NAME}.db"),
                config.getString("database.username","bukkit"),
                config.getString("database.password","walrus"),
                config.getString("database.isolation","SERIALIZABLE"),
                config.getBoolean("database.logging", false),
                config.getBoolean("database.rebuild", false)
        );

        config.set("database.rebuild", false);

    }

    @Override
    public EbeanServer getDatabase()
    {
        return database.getDatabase();
    }

    public int getNumJobs()
    {
        return numJobs;
    }

    public void setNumJobs(int numJobs)
    {
        this.numJobs = numJobs;
    }

    public int getNumBusinesses()
    {
        return numBusinesses;
    }

    public void setNumBusinesses(int numBusinesses)
    {
        this.numBusinesses = numBusinesses;
    }

    public int getNumEmployees()
    {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees)
    {
        this.numEmployees = numEmployees;
    }

}
