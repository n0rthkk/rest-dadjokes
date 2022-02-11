package com.example.rest.dadjokes.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Search {

    @JsonProperty("current_page")
    private String currentPage;
    private String limit;
    @JsonProperty("next_page")
    private String nextPage;
    @JsonProperty("previous_page")
    private String previous_page;
    private List<Joke> results;
    @JsonProperty("search_term")
    private String searchTerm;
    private String status;
    @JsonProperty("total_jokes")
    private String totalJokes;
    @JsonProperty("total_pages")
    private String totalPages;

}
