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
   private String callbackUrl;

    private String type;

    private String scheduledStartTime;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getScheduledStartTime() {
        return scheduledStartTime;
    }

    public void setScheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
    }



    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }



    @Override
    public String toString()
    {
        return "Execution [callbackUrl = "+callbackUrl+", type = "+type+", scheduledStartTime = "+scheduledStartTime+"]";
    }    
}
