package com.challenge.address.domain.ports.in;

import com.challenge.address.domain.model.Address;

import java.util.Optional;

public interface UpdateAddressUseCase {
    Optional<Address> updateAddress(Long id, Address updatedAddress);
}
