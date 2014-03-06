package io.github.Battelman2.StackMarket;

import com.avaje.ebean.validation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Battelman2 on 3/5/14.
 */

@Entity
@Table(name = "sm_shares")
public class Share
{
    @Id
    private int id;

    @NotNull
    private String owner;

    @NotNull
    private int sid;

    @NotNull
    private int qty;

    @NotNull
    private double purchasePrice;


    public static Share shareFromProperties(String owner, int sid, int qty, double purchasePrice)
    {
        Share share = new Share();
        share.setProperties(owner, sid, qty, purchasePrice);
        return share;
    }

    public void setProperties(String owner, int sid, int qty, double purchasePrice)
    {
        this.setOwner(owner);
        this.setSid(sid);
        this.setQty(qty);
        this.setPurchasePrice(purchasePrice);
    }


    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
