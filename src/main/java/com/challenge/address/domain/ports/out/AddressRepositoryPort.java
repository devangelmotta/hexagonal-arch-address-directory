package com.challenge.address.domain.ports.out;

import com.challenge.address.domain.model.Address;

import java.util.List;
import java.util.Optional;

public interface AddressRepositoryPort {
    Address save(Address address);
    Optional<Address> findById(Long id);
    List<Address> findAll();
    Optional<Address> update(Address address);
    boolean deleteById(Long id);
}
