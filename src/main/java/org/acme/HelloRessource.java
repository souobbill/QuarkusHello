package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class HelloRessource {

    @ConfigProperty(name = "greeting")
    String greeting;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greeting + " Quarkus";
    }

    @GET 
    @Path("/fr")
    @Produces(MediaType.TEXT_PLAIN)
    public String bonjour(){
        return "Bonjour Quarkus";
    }
}