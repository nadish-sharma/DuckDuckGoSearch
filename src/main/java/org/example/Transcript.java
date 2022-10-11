package org.example;

import java.util.List;

public class Transcript {

    public String getKey() {
        return key;
    }

    private String key = "8c4ea13a70mshdf3abffbd1c5fc2p1a3a20jsne68f5efa41cc";
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    private String query;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    List<Results> results;
}
