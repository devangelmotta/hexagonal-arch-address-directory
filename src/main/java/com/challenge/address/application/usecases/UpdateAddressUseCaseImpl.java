package com.challenge.address.application.usecases;

import com.challenge.address.domain.model.Address;
import com.challenge.address.domain.ports.in.UpdateAddressUseCase;
import com.challenge.address.domain.ports.out.AddressRepositoryPort;

import java.util.Optional;

public class UpdateAddressUseCaseImpl implements UpdateAddressUseCase {

    private final AddressRepositoryPort addressRepositoryPort;

    public UpdateAddressUseCaseImpl(AddressRepositoryPort addressRepositoryPort) {
        this.addressRepositoryPort = addressRepositoryPort;
    }

    @Override
    public Optional<Address> updateAddress(Long id, Address updatedAddress) {
        return addressRepositoryPort.update(updatedAddress);
    }
}
