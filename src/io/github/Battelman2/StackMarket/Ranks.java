package io.github.Battelman2.StackMarket;

/**
 * Created by williambattel on 3/2/14.
 */
public enum Ranks
{
    INTERN("intern", true, true, false, false, false, false, false),
    WORKER("worker", true, true, true, false, false, false, false),
    ASSISTANT("assistant", true, true, true, true, true, false, false),
    MANAGER("manager", true, true, true, true, true, true, false),
    OWNER("owner", true, true, true, true, true, true, true);

    private String title;

    Ranks(String _title, boolean containers, boolean redstone, boolean build, boolean land, boolean shop, boolean hire, boolean close)
    {
        title = _title;
    }

    public String getTitle()
    {
        return title;
    }
}
