package com.example.rest.dadjokes;

import com.example.rest.dadjokes.data.Search;
import com.example.rest.dadjokes.service.SearchService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/search")
public class SearchResource {

    @Inject
    @RestClient
    private SearchService searchService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Search searchDadJoke() {
        return searchService.searchJoke();


    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Search searchParametrizedDadJoke(@QueryParam("param") String param) {
//        return searchService.searchJokeWithParam(param);
//
//    }

}
