package com.vanbilloen.competitieplanning.model.builders;

import java.math.BigInteger;

import com.vanbilloen.competitieplanning.soap.GetMatchesRequest;

public class MatchesRequestBuilder extends AbstractRequestBuilder<MatchesRequestBuilder, GetMatchesRequest> {

    private BigInteger divisionId;
    private String club;
    private BigInteger season;

    @Override
    protected MatchesRequestBuilder actualBuilder() {
        return this;
    }

    public MatchesRequestBuilder withDivisionId(BigInteger divisionId) {
        this.divisionId = divisionId;
        return this;
    }

    public MatchesRequestBuilder withClub(String club) {
        this.club = club;
        return this;
    }

    public MatchesRequestBuilder withSeason(BigInteger season) {
        this.season = season;
        return this;
    }

    public GetMatchesRequest build() {
        GetMatchesRequest request = new GetMatchesRequest();
        request.setCredentials(credentialsType);
        request.setDivisionId(divisionId);
        request.setSeason(season);
        request.setClub(club);
        return request;
    }

}
