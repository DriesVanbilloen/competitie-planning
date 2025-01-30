package com.vanbilloen.competitieplanning.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vanbilloen.competitieplanning.exceptions.CompetitieRequestException;
import com.vanbilloen.competitieplanning.factory.RequestFactory;
import com.vanbilloen.competitieplanning.service.CompetitieSoapService;
import com.vanbilloen.competitieplanning.soap.ClubEntryType;
import com.vanbilloen.competitieplanning.soap.CredentialsType;
import com.vanbilloen.competitieplanning.soap.GetClubTeamsRequest;
import com.vanbilloen.competitieplanning.soap.GetClubs;
import com.vanbilloen.competitieplanning.soap.GetMatchesRequest;
import com.vanbilloen.competitieplanning.soap.TabTAPIPortType;
import com.vanbilloen.competitieplanning.soap.TabTAPIService;
import com.vanbilloen.competitieplanning.soap.TeamEntryType;
import com.vanbilloen.competitieplanning.soap.TeamMatchEntryType;

@Service
public class CompetitieSoapServiceImpl implements CompetitieSoapService {

    private final RequestFactory requestFactory;

    private final CredentialsType credentials;
    private TabTAPIPortType portType;

    public CompetitieSoapServiceImpl(RequestFactory requestFactory) {
        this.requestFactory = requestFactory;
        this.credentials = requestFactory.createCredentialsType();
        this.portType = new TabTAPIService().getTabTAPIPort();
    }

    @Override
    public ClubEntryType getClubById(String id, BigInteger season) {
        GetClubs getClubs = requestFactory.getClubsRequest(credentials, season);
        List<ClubEntryType> clubs = portType.getClubs(getClubs).getClubEntries();
        if (clubs.isEmpty()) {
            throw new CompetitieRequestException(String.format("Club with id %s not found for season %s", id, season.toString()));
        }
        return clubs.stream()
            .filter(item -> item.getUniqueIndex().equals(id))
            .findFirst()
            .orElseThrow(CompetitieRequestException::new);
    }

    @Override
    public List<TeamEntryType> getClubTeams(BigInteger season, String club) {
        GetClubTeamsRequest request = requestFactory.getClubTeamsRequest(credentials, season, club);
        List<TeamEntryType> teams = portType.getClubTeams(request).getTeamEntries();
        if (teams.isEmpty()) {
            throw new CompetitieRequestException(String.format("No teams found for club %s in season %s", club, season.toString()));
        }
        return teams;
    } 

    @Override
    public List<TeamMatchEntryType> getMatches(BigInteger divisionId, BigInteger season, String club) {
        GetMatchesRequest request = requestFactory.getMatchesRequest(credentials, divisionId, season, club);
        List<TeamMatchEntryType> matches = portType.getMatches(request).getTeamMatchesEntries();
        if (matches.isEmpty()) {
            throw new CompetitieRequestException(String.format("No matches for club %s with division %s in season %", club, divisionId.toString(), season.toString()));
        }
        return matches;
    }

}
