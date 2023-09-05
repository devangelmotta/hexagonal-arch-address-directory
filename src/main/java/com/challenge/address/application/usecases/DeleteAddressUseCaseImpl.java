package com.challenge.address.application.usecases;

import com.challenge.address.domain.ports.in.DeleteAddressUseCase;
import com.challenge.address.domain.ports.out.AddressRepositoryPort;

public class DeleteAddressUseCaseImpl implements DeleteAddressUseCase {

    private final AddressRepositoryPort addressRepositoryPort;

    public DeleteAddressUseCaseImpl(AddressRepositoryPort addressRepositoryPort) {
        this.addressRepositoryPort = addressRepositoryPort;
    }

    @Override
    public boolean deleteAddress(Long id) {
        return addressRepositoryPort.deleteById(id);
    }
}
