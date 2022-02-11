package com.example.rest.dadjokes.service;

import com.example.rest.dadjokes.data.Joke;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/j")
@RegisterRestClient(configKey = "config.api.joke")
public interface JokeService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Joke getJoke(@PathParam("id") String id);

}
