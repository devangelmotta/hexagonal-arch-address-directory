package com.challenge.address.domain.ports.in;

import com.challenge.address.domain.model.Address;

public interface CreateAddressUseCase {
    Address createAddress(Address address);
}
