package com.redhat.syseng.soleng.rhpam.rest;


import java.io.IOException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/")
//@Path("/")
//@Produces(MediaType.APPLICATION_JSON)
//@ApplicationScoped
public class BackendResource {

    @GET
    public Response get(@QueryParam("processId") String processId, @QueryParam("groupId") String groupId, @QueryParam("artifactId") String artifactId, @QueryParam("version") String version) throws IOException {
        System.out.println("!!!!!!!!!!!!!!!! get" + groupId);
        String result = BackendServiceImpl.getInfoFromKjar(processId, groupId, artifactId, version);
        return Response.ok(result).build();
    }

    @GET
    @Path("/products/{sku}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void getTest(@PathParam("sku") Long sku) {
        System.out.println("!!!!!!!!!!!!!!!! getTest" + sku);

    }

}
