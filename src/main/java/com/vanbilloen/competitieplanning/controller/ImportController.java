package com.vanbilloen.competitieplanning.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanbilloen.competitieplanning.exceptions.ParameterMissingException;

@RestController
public class ImportController {

    @GetMapping("/startImport")
    public String startImport(String name) {
        if (StringUtils.isBlank(name)) {
            throw new ParameterMissingException("Name cannot be empty");
        }
        return "Success";
    }

}
