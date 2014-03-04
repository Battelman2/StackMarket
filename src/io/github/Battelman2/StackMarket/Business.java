package io.github.Battelman2.StackMarket;

import com.avaje.ebean.validation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Battelman2 on 3/2/14.
 */

@Entity
@Table(name="sm_businesses")
public class Business
{

    /**
     * Factory method that creates a new Business instance given a name and type
     * @param _name The name of the business.
     * @param _type The type of business.
     * @return OwnedLand
     */
    public static Business businessFromProperties(String _name, int _type)
    {
        Business biz = new Business();
        biz.setProperties(_name, _type);
        return biz;
    }

    /**
     * Gets Business from the database
     * @param _name Name of business searching for.
     * @return
     */
    public static Business getLandFromDatabaseUsingName(String _name)
    {
        return StackMarket.plugin().getDatabase().find(Business.class)
                .where()
                .eq("name", _name)
                .findUnique();
    }

    @Id
    private int id;

    @NotNull
    private String name;

    @NotNull
    private int type;

    public enum types
    {
        SOLEPROPRIETORSHIP(0, 1, false),
        LIMITEDLIABILITYCOMPANY(1, 3, false),
        CORPORATION(2, 1, true);

        private int typeInt;

        types(int _type, int _owners, boolean _stocks)
        {
            typeInt = _type;
        }

        public int getTypeInt()
        {
            return typeInt;
        }
    }

    /*
    public Business (String _name, String _type)
    {
        name = _name;
        type = _type;
    }
    */

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
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
     * @param _name The name of the employee.
     * @param _type The rank in said business.
     */
    public void setProperties(String _name, int _type)
    {
        this.setName(_name);
        this.setType(_type);
    }
}
