package com.redhat.developer.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    final String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
    String greeting;

    private int count = 0;

    @GET    
    @Produces(MediaType.TEXT_PLAIN)
    public String greet() {
        count++;
        greeting = System.getenv().getOrDefault("GREETING","Default");
        return greeting + " from Quarkus! " + count + " on " + hostname + "\n";
    }

    @GET
    @Path("/health")
    @Produces(MediaType.TEXT_PLAIN)
    public String health() {
        return "OK";
    }

    @GET
    @Path("/configure")
    public String configure() {
        String databaseConn = System.getenv().getOrDefault("DBCONN","Default");
        String msgBroker = System.getenv().getOrDefault("MSGBROKER","Default");
        greeting = System.getenv().getOrDefault("GREETING","Default");
        String love = System.getenv().getOrDefault("LOVE","Default");
        return "Configuration for : " + hostname + "\n" 
            + "databaseConn=" + databaseConn + "\n"
            + "msgBroker=" + msgBroker + "\n"
            + "greeting=" + greeting + "\n"
            + "love=" + love + "\n";
   }

}