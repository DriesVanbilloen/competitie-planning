package com.vanbilloen.competitieplanning.model.mapper;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.vanbilloen.competitieplanning.model.dto.TeamDto;
import com.vanbilloen.competitieplanning.soap.TeamEntryType;

@Service
public class TeamMapper {

    public TeamDto toDto(TeamEntryType teamEntryType) {
        return new TeamDto(teamEntryType.getTeam(), teamEntryType.getDivisionName(), teamEntryType.getDivisionId().toString());
    }

    public List<TeamDto> toDtoList(List<TeamEntryType> teamEntryTypes){
        return teamEntryTypes.stream()
                .map(item -> this.toDto(item))
                .collect(Collectors.toList());
    }

}
