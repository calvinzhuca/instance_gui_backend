package com.redhat.syseng.soleng.rhpam.rest;

import com.redhat.syseng.soleng.rhpam.model.MigrationDefinition;
import com.redhat.syseng.soleng.rhpam.model.Plan;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
//@Path("/")
//@Produces(MediaType.APPLICATION_JSON)
//@ApplicationScoped
public class BackendResource {

    @GET
    public Response get(@QueryParam("processId") String processId, @QueryParam("groupId") String groupId, @QueryParam("artifactId") String artifactId, @QueryParam("version") String version) throws IOException {
        String result = BackendServiceImpl.getInfoJsonFromKjar(processId, groupId, artifactId, version);
        return Response.ok(result).build();
    }

    @GET
    @Path("/both")
    public Response getBoth(
            @QueryParam("sourceProcessId") String sourceProcessId, @QueryParam("sourceGroupId") String sourceGroupId, @QueryParam("sourceArtifactId") String sourceArtifactId, @QueryParam("sourceVersion") String sourceVersion,
            @QueryParam("targetProcessId") String targetProcessId, @QueryParam("targetGroupId") String targetGroupId, @QueryParam("targetArtifactId") String targetArtifactId, @QueryParam("targetVersion") String targetVersion
    ) throws IOException {
        String result = BackendServiceImpl.getBothInfoJsonFromKjar(sourceProcessId, sourceGroupId, sourceArtifactId, sourceVersion,
                targetProcessId, targetGroupId, targetArtifactId, targetVersion
        );
        return Response.ok(result).build();
    }

    @GET
    @Path("/instances")
    public Response getAllRunningInstances(@QueryParam("containerId") String containerId
    ) throws IOException, URISyntaxException {
        System.out.println("getAllRunningInstances containerId " + containerId);
        String result = BackendServiceImpl.getRunningInstancesFromKieServer(containerId);
        System.out.println("getAllRunningInstances result " + result);
        return Response.ok(result).build();
    }

    @GET
    @Path("/plans")
    public Response pimServicesGetAllPlans() throws IOException, URISyntaxException {
        System.out.println("pimServicesGetAllPlans ");
        String result = PimServicesProxy.getAllPlans();
        System.out.println("pimServicesGetAllPlans finished: " + result);
        return Response.ok(result).build();
    }

    @POST
    @Path("/plans")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response pimServicesCreatePlan(Plan plan) throws IOException, URISyntaxException {
        System.out.println("pimServicesCreatePlan ");
        String result = PimServicesProxy.createPlan(plan);
        System.out.println("pimServicesCreatePlan finished: " + result);
        return Response.ok(result).build();
    }

    @PUT
    @Path("/plans/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response pimServicesUpdatePlan(Plan plan, @PathParam("id") String id) throws IOException, URISyntaxException {
        System.out.println("pimServicesUpdatePlan " + id);
        System.out.println("pimServicesUpdatePlan " + plan);
        String result = PimServicesProxy.updatePlan(plan, id);
        System.out.println("pimServicesUpdatePlan finished: " + result);
        return Response.ok("").build();
    }

    @DELETE
    @Path("/plans/{id}")
    public Response pimServicesDeletePlan(@PathParam("id") String id) throws IOException, URISyntaxException {
        System.out.println("pimServicesDeletePlan: " + id);
        String result = PimServicesProxy.deletePlan(id);
        System.out.println("pimServicesDeletePlan finished: " + result);
        return Response.ok(result).build();
    }

    @POST
    @Path("/migrations")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response pimServicesExecuteMigration(MigrationDefinition migration) throws IOException, URISyntaxException {
        System.out.println("!!!!!!!!!!!!!!!pimServicesExecuteMigration: " + migration);
        String result = PimServicesProxy.executeMigration(migration);
        System.out.println("pimServicesExecuteMigration finished: " + result);
        return Response.ok(result).build();
    }

    @GET
    @Path("/migrations")
    public Response pimServicesGetAllMigrations() throws IOException, URISyntaxException {
        System.out.println("pimServicesGetAllMigrations ");
        String result = PimServicesProxy.getAllMigrations();
        System.out.println("pimServicesGetAllMigrations finished: " + result);
        return Response.ok(result).build();
    }

    @GET
    @Path("/migrations/{id}")
    public Response pimServicesGetOneMigration(@PathParam("id") String id) throws IOException, URISyntaxException {
        System.out.println("pimServicesGetOneMigration: " + id);
        String result = PimServicesProxy.getOneMigration(id);
        System.out.println("pimServicesGetOneMigration finished: " + result);
        return Response.ok(result).build();
    }    
    
    @GET
    @Path("/migrations/{id}/results")
    public Response pimServicesGetOneMigrationLogs(@PathParam("id") String id) throws IOException, URISyntaxException {
        System.out.println("pimServicesGetOneMigrationLogs: " + id);
        String result = PimServicesProxy.getOneMigrationLogs(id);
        System.out.println("pimServicesGetOneMigrationLogs finished: " + result);
        return Response.ok(result).build();
    }     
    
}
