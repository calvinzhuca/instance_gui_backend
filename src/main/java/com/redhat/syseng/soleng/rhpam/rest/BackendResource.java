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

}
