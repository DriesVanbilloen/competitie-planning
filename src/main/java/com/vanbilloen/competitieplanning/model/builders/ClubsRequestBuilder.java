package com.vanbilloen.competitieplanning.model.builders;

import java.math.BigInteger;

import com.vanbilloen.competitieplanning.soap.GetClubs;

public class ClubsRequestBuilder extends AbstractRequestBuilder<ClubsRequestBuilder, GetClubs> {

    private BigInteger season;

    public ClubsRequestBuilder withSeason(BigInteger season) {
        this.season = season;
        return this;
    }

    public GetClubs build() {
        GetClubs getClubs = new GetClubs();
        getClubs.setCredentials(credentialsType);
        getClubs.setSeason(season);
        return getClubs;
    }

    @Override
    public ClubsRequestBuilder actualBuilder() {
        return this;
    }
 
}
