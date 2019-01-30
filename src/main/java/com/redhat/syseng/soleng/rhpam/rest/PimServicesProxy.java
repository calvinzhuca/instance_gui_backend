/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redhat.syseng.soleng.rhpam.rest;

import com.redhat.syseng.soleng.rhpam.model.MigrationDefinition;
import com.redhat.syseng.soleng.rhpam.model.Plan;
import java.net.URISyntaxException;

/**
 *
 * @author czhu
 */
public class PimServicesProxy {


    public static String getAllPlans() throws URISyntaxException {
        String result = ServicesUtil.getPimService().getAllPlans();
        return result;
    }

    public static String createPlan(Plan plan) throws URISyntaxException {
        String result = ServicesUtil.getPimService().createPlan(plan);
        return result;
    }
    

    public static String updatePlan(Plan plan, String id) throws URISyntaxException {
         String result = ServicesUtil.getPimService().updatePlan(plan, id);
        return result;
    }    
    
    public static String deletePlan(String id) throws URISyntaxException {
        String result = ServicesUtil.getPimService().deletePlan(id);
        return result;
    }    
    
    public static String executeMigration(MigrationDefinition migration) throws URISyntaxException {
        String result = ServicesUtil.getPimService().executeMigration(migration);
        return result;
    }
    
    
    public static String getAllMigrations() throws URISyntaxException {
        String result = ServicesUtil.getPimService().getAllMigrations();
        return result;
    }

    public static String getOneMigration(String id) throws URISyntaxException {
        String result = ServicesUtil.getPimService().getOneMigration(id);
        System.out.println("!!!!!!!!!!!!!!getOneMigration result: " + result);
        if (result == null) result = "";
        return result;
    }    
}
