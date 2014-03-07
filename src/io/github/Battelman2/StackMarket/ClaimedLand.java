package io.github.Battelman2.StackMarket;

import com.avaje.ebean.validation.NotNull;
import org.bukkit.Chunk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Battelman2 on 3/4/14.
 */

@Entity
@Table(name="sm_claimedland")
public class ClaimedLand
{
    @Id
    private int id;

    @NotNull
    private int bid;

    @NotNull
    private String worldName;

    @NotNull
    private int x;

    @NotNull
    private int z;


    /**
     * Factory method that creates a new ClaimedLand instance given an owner business name and chunk
     * @param bid The business that claimed the land.
     * @param _c The chunk this land represents
     * @return ClaimedLand
     */
    public static ClaimedLand landFromProperties(int bid, Chunk _c)
    {
        ClaimedLand lnd = new ClaimedLand();
        lnd.setProperties(bid, _c);
        return lnd;

    }

    /**
     * Sets the properties of an ClaimedLand instance
     * @param bid id of the owning business
     * @param c chunk to be represented
     */
    public void setProperties(int bid, Chunk c)
    {
        this.setBid(bid);
        this.setX(c.getX());
        this.setZ(c.getZ());
        this.setWorldName(c.getWorld().getName());
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getBid()
    {
        return bid;
    }

    public void setBid(int bid)
    {
        this.bid = bid;
    }

    public String getWorldName()
    {
        return worldName;
    }

    public void setWorldName(String worldName)
    {
        this.worldName = worldName;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getZ()
    {
        return z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }
}
