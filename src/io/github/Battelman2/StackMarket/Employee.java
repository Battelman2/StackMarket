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
     * @param _onShift Is the employee on shift for the bid?
     * @param _name The name of the employee.
     * @param _rank The rank in said business.
     * @return Employee
     */
    public static Employee employeeFromProperties(int _bid, boolean _onShift, String _name, int _rank)
    {
        Employee employee = new Employee();
        employee.setProperties(_bid, _onShift, _name, _rank);
        return employee;
    }

    @Id
    private int id;

    @NotNull
    private int bid;

    private boolean onShift;

    @NotNull
    private String name;

    @NotNull
    private int rank;

    /**
     * Sets the properties of an Employee instance
     * @param _bid The id of the business.
     * @param _name The name of the employee.
     * @param _rank The rank in said business.
     */
    public void setProperties(int _bid, boolean _onShift, String _name, int _rank)
    {
        this.setBid(_bid);
        this.setShift(_onShift);
        this.setName(_name);
        this.setRank(_rank);
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

    public boolean getShift()
    {
        return onShift;
    }

    public void setShift(boolean onShift)
    {
        this.onShift = onShift;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRank()
    {
        return rank;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }
}
