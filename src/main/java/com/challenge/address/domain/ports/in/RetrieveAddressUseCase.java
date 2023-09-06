package com.challenge.address.domain.ports.in;

import com.challenge.address.domain.model.Address;

import java.util.List;
import java.util.Optional;

public interface RetrieveAddressUseCase {
    Optional<Address> getAddressById(String id);
    List<Address> getAllAddress();
}
