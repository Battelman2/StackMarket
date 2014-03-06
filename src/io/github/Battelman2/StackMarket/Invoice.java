package io.github.Battelman2.StackMarket;

import com.avaje.ebean.validation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Battelman2 on 3/5/14.
 */

@Entity
@Table(name="sm_invoices")
public class Invoice
{

    @Id
    private int id;

    @NotNull
    private int bid;

    @NotNull
    private String player;

    @NotNull
    private double amount;

    /**
     * Factory method that creates a new Invoice instance given a business, player, and amount.
     * @param bid Business ID of invoice
     * @param player Player who must pay
     * @param amount Amount to be paid
     * @return Invoice
     */
    public static Invoice invoiceFromProperties(int bid, String player, double amount)
    {
        Invoice invoice = new Invoice();
        invoice.setProperties(bid, player, amount);
        return invoice;
    }

    /**
     * Sets the properties of an Invoice instance
     * @param bid Business ID of invoice
     * @param player Player who must pay
     * @param amount Amount to be paid
     */
    public void setProperties(int bid, String player, double amount)
    {
        this.setBid(bid);
        this.setPlayer(player);
        this.setAmount(amount);
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}
