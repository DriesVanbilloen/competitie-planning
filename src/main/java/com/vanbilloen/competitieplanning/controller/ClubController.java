package com.vanbilloen.competitieplanning.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vanbilloen.competitieplanning.model.dto.ClubDto;
import com.vanbilloen.competitieplanning.model.mapper.ClubMapper;
import com.vanbilloen.competitieplanning.model.mapper.TeamMapper;
import com.vanbilloen.competitieplanning.service.CompetitieSoapService;
import com.vanbilloen.competitieplanning.soap.ClubEntryType;
import com.vanbilloen.competitieplanning.soap.TeamEntryType;
import com.vanbilloen.competitieplanning.util.CompetitieUtil;

@RestController
public class ClubController {

    private final CompetitieSoapService competitieSoapService;
    private final ClubMapper clubMapper;
    private final TeamMapper teamMapper;

    public ClubController(CompetitieSoapService competitieSoapService, ClubMapper clubMapper, TeamMapper teamMapper) {
        this.competitieSoapService = competitieSoapService;
        this.clubMapper = clubMapper;
        this.teamMapper = teamMapper;
    }

    @GetMapping("/club")
    public ClubDto getClub(@RequestParam String clubId, @RequestParam String seasonParam) {
        final BigInteger season = CompetitieUtil.getSeasonFromString(seasonParam);
        final ClubEntryType clubEntryType = competitieSoapService.getClubById(clubId, season);
        return clubMapper.toDto(clubEntryType);
    }

    @GetMapping("/teams")
    public Object getTeamsByClub(@RequestParam String clubId, @RequestParam String seasonParam) {
        final BigInteger season = CompetitieUtil.getSeasonFromString(seasonParam);
        final List<TeamEntryType> teams = competitieSoapService.getClubTeams(season, clubId);
        return teamMapper.toDtoList(teams);
    }
}
