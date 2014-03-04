package io.github.Battelman2.StackMarket;

import com.avaje.ebean.validation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by williambattel on 3/4/14.
 */

@Entity
@Table(name="sm_claimedland")
public class ClaimedLand
{
    @Id
    private int id;

    @NotNull
    private String bizName;

    @NotNull
    private int x;

    @NotNull
    private int z;
}
