package io.github.Battelman2.StackMarket;

import com.avaje.ebean.validation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Battelman2 on 3/2/14.
 */

@Entity
@Table(name="sm_employees")
public class Employee
{

    /**
     * Factory method that creates a new Employee instance given a bid, name, and rank
     * @param _bid The id of the business.
     * @param _name The name of the employee.
     * @param _rank The rank in said business.
     * @return Employee
     */
    public static Employee employeeFromProperties(int _bid, String _name, String _rank)
    {
        Employee employee = new Employee();
        employee.setProperties(_bid, _name, _rank);
        return employee;
    }

    @Id
    private int id;

    @NotNull
    private int bid;

    @NotNull
    private String name;

    @NotNull
    private String rank;

    public String getRank()
    {
        return rank;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBid()
    {
        return bid;
    }

    public void setBid(int bid)
    {
        this.bid = bid;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Sets the properties of an Employee instance
     * @param _bid The id of the business.
     * @param _name The name of the employee.
     * @param _rank The rank in said business.
     */
    public void setProperties(int _bid, String _name, String _rank)
    {
        this.setBid(_bid);
        this.setName(_name);
        this.setRank(_rank);
    }
}
