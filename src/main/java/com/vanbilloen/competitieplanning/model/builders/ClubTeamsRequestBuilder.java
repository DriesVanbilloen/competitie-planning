package com.vanbilloen.competitieplanning.model.builders;

import java.math.BigInteger;

import com.vanbilloen.competitieplanning.soap.GetClubTeamsRequest;

public class ClubTeamsRequestBuilder extends AbstractRequestBuilder<ClubTeamsRequestBuilder, GetClubTeamsRequest> {

    private String club;
    private BigInteger season;
    
    public ClubTeamsRequestBuilder withClub(String club) {
        this.club = club;
        return this;
    }

    public ClubTeamsRequestBuilder withSeason(BigInteger season) {
        this.season = season;
        return this;
    }

    public GetClubTeamsRequest build() {
        GetClubTeamsRequest request = new GetClubTeamsRequest();
        request.setCredentials(credentialsType);
        request.setClub(club);
        request.setSeason(season);
        return request;
    }

    @Override
    public ClubTeamsRequestBuilder actualBuilder() {
        return this;
    }

}
