/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redhat.syseng.soleng.rhpam.model;

/**
 *
 * @author czhu
 */
public class Execution2 {
   private String callback_url;

    private String type;

    private String scheduled_start_time;

    public String getCallback_url ()
    {
        return callback_url;
    }

    public void setCallback_url (String callback_url)
    {
        this.callback_url = callback_url;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getScheduled_start_time ()
    {
        return scheduled_start_time;
    }

    public void setScheduled_start_time (String scheduled_start_time)
    {
        this.scheduled_start_time = scheduled_start_time;
    }

    @Override
    public String toString()
    {
        return "Execution [callback_url = "+callback_url+", type = "+type+", scheduled_start_time = "+scheduled_start_time+"]";
    }    
}
