package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.annotation.security.RolesAllowed;

@Path("/hello-resteasy")
public class GreetingResource {

    @GET
    @RolesAllowed("usager")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}