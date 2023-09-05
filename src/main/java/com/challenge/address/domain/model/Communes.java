package com.challenge.address.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Communes {
    private String name;
    private String code;

    public Communes() {
    }

    @JsonProperty("comuna")
    private void unpackComuna(Map<String, Object> comuna) {
        this.name = (String) comuna.get("name");
        this.code = (String) comuna.get("code");
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}
