package io.github.Battelman2.StackMarket;

/**
 * Created by williambattel on 3/2/14.
 */
public enum Ranks
{
    INTERN("intern", "Intern", true, true, false, false, false, false, false),
    WORKER("worker", "Worker", true, true, true, false, false, false, false),
    ASSISTANT("assistant", "Assistant", true, true, true, true, true, false, false),
    MANAGER("manager", "Manager", true, true, true, true, true, true, false),
    OWNER("owner", "Owner", true, true, true, true, true, true, true);

    private String dbname;
    private String fullName;

    Ranks(String _dbname, String _fullName, boolean containers, boolean redstone, boolean build, boolean land, boolean shop, boolean hire, boolean close)
    {
        dbname = _dbname;
        fullName = _fullName;
    }

    public String getDbname()
    {
        return dbname;
    }

    public String getFullName()
    {
        return fullName;
    }
}
