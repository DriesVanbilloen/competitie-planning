package com.vanbilloen.competitieplanning.service;

import java.math.BigInteger;
import java.util.List;

import com.vanbilloen.competitieplanning.soap.ClubEntryType;
import com.vanbilloen.competitieplanning.soap.TeamEntryType;
import com.vanbilloen.competitieplanning.soap.TeamMatchEntryType;

public interface CompetitieSoapService {

    ClubEntryType getClubById(String id, BigInteger season);

    List<TeamEntryType> getClubTeams(BigInteger season, String club);

    List<TeamMatchEntryType> getMatches(BigInteger divisionId, BigInteger season, String club)

}
