package com.redhat.coolstore.rest;

import javax.enterprise.context.SessionScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;


@SessionScoped
@Path("/hostname")
public class Hostname implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7227732980791688773L;


    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHostname() {

        return System.getenv("HOSTNAME");
    }

}
