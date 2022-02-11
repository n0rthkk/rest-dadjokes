package com.example.rest.dadjokes.service;

import com.example.rest.dadjokes.data.Search;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/search")
@RegisterRestClient(configKey = "config.api.joke")
public interface SearchService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Search searchJoke();

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    Search searchJokeWithParam(@QueryParam("term") String param);

    // todo: create parametrized search
}
