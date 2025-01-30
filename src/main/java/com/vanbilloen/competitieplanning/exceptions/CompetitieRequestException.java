package com.vanbilloen.competitieplanning.exceptions;

public class CompetitieRequestException extends RuntimeException {

    public CompetitieRequestException() {
        super();
    }

    public CompetitieRequestException(String message) {
        super(message);
    }

}
