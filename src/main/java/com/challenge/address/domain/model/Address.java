package com.challenge.address.domain.model;

public class Address {

    private Long id;
    private String name;
    private String lastName;
    private String phone;
    private String comuna;

    public Address(Long id, String name, String lastName, String phone, String comuna) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.comuna = comuna;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
}
