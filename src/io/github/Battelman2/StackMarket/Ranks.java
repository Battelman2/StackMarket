package io.github.Battelman2.StackMarket;

/**
 * Created by Battelman2 on 3/2/14.
 */
public enum Ranks
{
    INTERN(0, "Intern", true, true, false, false, false, false, false),
    WORKER(1, "Worker", true, true, true, false, false, false, false),
    ASSISTANT(2, "Assistant", true, true, true, true, true, false, false),
    MANAGER(3, "Manager", true, true, true, true, true, true, false),
    OWNER(4, "Owner", true, true, true, true, true, true, true);

    private int dbname;

    private String fullName;

    Ranks(int _dbname, String _fullName, boolean containers, boolean redstone, boolean build, boolean land, boolean shop, boolean hire, boolean close)
    {
        dbname = _dbname;
        fullName = _fullName;
    }

    public int getDbname()
    {
        return dbname;
    }

    public String getFullName()
    {
        return fullName;
    }
}
