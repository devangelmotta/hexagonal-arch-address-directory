package com.challenge.address.application.usecases;

import com.challenge.address.domain.model.Address;
import com.challenge.address.domain.ports.in.CreateAddressUseCase;
import com.challenge.address.domain.ports.out.AddressRepositoryPort;

public class CreateAddressUseCaseImpl implements CreateAddressUseCase {

    private final AddressRepositoryPort addressRepositoryPort;

    public CreateAddressUseCaseImpl(AddressRepositoryPort addressRepositoryPort) {
        this.addressRepositoryPort = addressRepositoryPort;
    }

    @Override
    public Address createAddress(Address address) {
        return addressRepositoryPort.save(address);
    }
}
