package com.vanbilloen.competitieplanning.model.builders;

import com.vanbilloen.competitieplanning.soap.CredentialsType;

public class CredentialsBuilder {

    private String account;
    private String password;

    public CredentialsBuilder withAccount(String account) {
        this.account = account;
        return this;
    }

    public CredentialsBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public CredentialsType build() {
        CredentialsType build = new CredentialsType();
        build.setAccount(account);
        build.setPassword(password);
        return build;
    }

}
