package io.github.Battelman2.StackMarket;

import com.avaje.ebean.validation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Battelman2 on 3/5/14.
 */

@Entity
@Table(name = "sm_stocks")
public class Stock
{

    @Id
    private int id;

    @NotNull
    private String ticker;

    @NotNull
    private int bid;

    @NotNull
    private int privateCap;

    @NotNull
    private int publicCap;

    @NotNull
    private double last;

    @NotNull
    private double open;

    @NotNull
    private double high;

    @NotNull
    private double low;


    public static Stock stockFromProperties(String ticker, int bid, int privateCap, int publicCap, double last, double open, double high, double low)
{
    Stock stock = new Stock();
    stock.setProperties(ticker, bid, privateCap, publicCap, last, open, high, low);
    return stock;
}

    public void setProperties(String ticker, int bid, int privateCap, int publicCap, double last, double open, double high, double low)
    {
        this.setTicker(ticker);
        this.setBid(bid);
        this.setPrivateCap(privateCap);
        this.setPublicCap(publicCap);
        this.setLast(last);
        this.setOpen(open);
        this.setHigh(high);
        this.setLow(low);
    }


    public double getLow()
    {
        return low;
    }

    public void setLow(double low)
    {
        this.low = low;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTicker()
    {
        return ticker;
    }

    public void setTicker(String ticker)
    {
        this.ticker = ticker;
    }

    public int getBid()
    {
        return bid;
    }

    public void setBid(int bid)
    {
        this.bid = bid;
    }

    public int getPrivateCap()
    {
        return privateCap;
    }

    public void setPrivateCap(int privateCap)
    {
        this.privateCap = privateCap;
    }

    public int getPublicCap()
    {
        return publicCap;
    }

    public void setPublicCap(int publicCap)
    {
        this.publicCap = publicCap;
    }

    public double getLast()
    {
        return last;
    }

    public void setLast(double last)
    {
        this.last = last;
    }

    public double getOpen()
    {
        return open;
    }

    public void setOpen(double open)
    {
        this.open = open;
    }

    public double getHigh()
    {
        return high;
    }

    public void setHigh(double high)
    {
        this.high = high;
    }

}
