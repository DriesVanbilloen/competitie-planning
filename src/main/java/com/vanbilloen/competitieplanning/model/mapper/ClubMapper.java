package com.vanbilloen.competitieplanning.model.mapper;

import org.springframework.stereotype.Service;

import com.vanbilloen.competitieplanning.model.dto.ClubDto;
import com.vanbilloen.competitieplanning.soap.ClubEntryType;

@Service
public class ClubMapper {

    public ClubDto toDto(ClubEntryType entryType) {
        return new ClubDto(entryType.getLongName(), entryType.getUniqueIndex());
    }

}
