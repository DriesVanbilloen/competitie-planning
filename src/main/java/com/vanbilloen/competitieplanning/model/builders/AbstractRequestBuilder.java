package com.vanbilloen.competitieplanning.model.builders;

import com.vanbilloen.competitieplanning.soap.CredentialsType;

public abstract class AbstractRequestBuilder<T extends AbstractRequestBuilder<T, B>, B extends Object> {

    protected CredentialsType credentialsType;

    public T withCredentialType(CredentialsType credentialsType) {
        this.credentialsType = credentialsType;
        return actualBuilder();
    }

    protected abstract T actualBuilder();

    protected abstract B build();

}
