package com.example.rest.dadjokes;

import com.example.rest.dadjokes.data.Joke;
import com.example.rest.dadjokes.service.JokeService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/j")
public class JokeResource {

    @Inject
    @RestClient
    private JokeService jokeService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Joke getDadJoke(@PathParam("id") String id) {
        return jokeService.getJoke(id);

    }

}