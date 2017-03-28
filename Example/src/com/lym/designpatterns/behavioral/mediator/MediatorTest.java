package com.lym.designpatterns.behavioral.mediator;

/**
 * Created by lym on 2017/3/28.
 */
public class MediatorTest {

    public static void main(String[] args)
    {
        Agent agent = new Agent();
        Tenant tenant = new Tenant("小李",agent);
        Landlord landlord = new Landlord("杨房东",agent);

        agent.setTenant(tenant);
        agent.setLandlord(landlord);

        tenant.release("我需要租一套1房1厅的房子");
        landlord.release("我有一套2房1厅的房子需要出租");

    }

}
