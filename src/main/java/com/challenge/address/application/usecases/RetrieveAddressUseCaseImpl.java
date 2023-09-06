package com.challenge.address.application.usecases;

import com.challenge.address.domain.model.Address;
import com.challenge.address.domain.ports.in.RetrieveAddressUseCase;
import com.challenge.address.domain.ports.out.AddressRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveAddressUseCaseImpl implements RetrieveAddressUseCase {

    private final AddressRepositoryPort addressRepositoryPort;

    public RetrieveAddressUseCaseImpl(AddressRepositoryPort addressRepositoryPort) {
        this.addressRepositoryPort = addressRepositoryPort;
    }

    @Override
    public Optional<Address> getAddressById(String id) {
        return addressRepositoryPort.findById(id);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepositoryPort.findAll();
    }
}
