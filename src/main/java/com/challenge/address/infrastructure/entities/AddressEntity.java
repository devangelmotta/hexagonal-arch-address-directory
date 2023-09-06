package com.challenge.address.infrastructure.entities;

import com.challenge.address.domain.model.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String lastName;
    private String phone;
    private String comuna;

    public AddressEntity() {
    }

    public AddressEntity(String id, String name, String lastName, String  phone, String comuna) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.comuna = comuna;
    }

    public static AddressEntity fromDomainModel(Address address) {
        return new AddressEntity(address.getId(), address.getName(), address.getLastName(), address.getPhone(), address.getComuna());
    }

    public Address toDomainModel() {
        return new Address(id, name, lastName, phone, comuna);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
