package com.lym.designpatterns.behavioral.mediator;

/**
 * Created by lym on 2017/3/28.
 */
//中介
public class Agent {

    //租客
    private Tenant tenant;

    //房东
    private Landlord landlord;


    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public void releaseListings(String message,Person person)
    {
        if(person == this.landlord)
        {
            this.landlord.release(message);
        }
        else
        {
            this.tenant.release(message);
        }
    }

}
