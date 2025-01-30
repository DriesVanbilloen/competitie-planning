package com.vanbilloen.competitieplanning.factory;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vanbilloen.competitieplanning.model.builders.ClubTeamsRequestBuilder;
import com.vanbilloen.competitieplanning.model.builders.ClubsRequestBuilder;
import com.vanbilloen.competitieplanning.model.builders.CredentialsBuilder;
import com.vanbilloen.competitieplanning.model.builders.MatchesRequestBuilder;
import com.vanbilloen.competitieplanning.soap.CredentialsType;
import com.vanbilloen.competitieplanning.soap.GetClubTeamsRequest;
import com.vanbilloen.competitieplanning.soap.GetClubs;
import com.vanbilloen.competitieplanning.soap.GetMatchesRequest;

@Service
public class RequestFactory {

    @Value("${competitie.account}")
    private String account;

    @Value("${competitie.password}")
    private String password;

    public CredentialsType createCredentialsType() {
        return new CredentialsBuilder()
        .withAccount(account)
        .withPassword(password)
        .build();
    }

    public GetClubs getClubsRequest(CredentialsType credentialsType, BigInteger season) {
        return new ClubsRequestBuilder()
            .withSeason(season)
            .withCredentialType(credentialsType) 
            .build();
    }

    public GetClubTeamsRequest getClubTeamsRequest(CredentialsType credentialsType, BigInteger season, String club) {
        return new ClubTeamsRequestBuilder()
            .withClub(club)
            .withSeason(season)
            .withCredentialType(credentialsType)
            .build();
    }

    public GetMatchesRequest getMatchesRequest(CredentialsType credentialsType, BigInteger divisionId, BigInteger season, String club) {
        return new  MatchesRequestBuilder()
            .withCredentialType(credentialsType)
            .withDivisionId(divisionId)
            .withSeason(season)
            .withClub(club)
            .build();
    }

}
