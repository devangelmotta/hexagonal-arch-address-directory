package com.challenge.address.application.services;

import com.challenge.address.domain.model.Address;
import com.challenge.address.domain.model.Communes;
import com.challenge.address.domain.ports.in.CreateAddressUseCase;
import com.challenge.address.domain.ports.in.DeleteAddressUseCase;
import com.challenge.address.domain.ports.in.GetCommunesUseCase;
import com.challenge.address.domain.ports.in.RetrieveAddressUseCase;
import com.challenge.address.domain.ports.in.UpdateAddressUseCase;

import java.util.List;
import java.util.Optional;

public class AddressService implements CreateAddressUseCase, RetrieveAddressUseCase, UpdateAddressUseCase, DeleteAddressUseCase, GetCommunesUseCase {

    private final CreateAddressUseCase createAddressUseCase;
    private final RetrieveAddressUseCase retrieveAddressUseCase;
    private final UpdateAddressUseCase updateAddressUseCase;
    private final DeleteAddressUseCase deleteAddressUseCase;
    private final GetCommunesUseCase getCommunesUseCase;

    public AddressService(CreateAddressUseCase createAddressUseCase, RetrieveAddressUseCase retrieveAddressUseCase,
                          UpdateAddressUseCase updateAddressUseCase, DeleteAddressUseCase deleteAddressUseCase,
                          GetCommunesUseCase getCommunesUseCase) {
        this.createAddressUseCase = createAddressUseCase;
        this.retrieveAddressUseCase = retrieveAddressUseCase;
        this.updateAddressUseCase = updateAddressUseCase;
        this.deleteAddressUseCase = deleteAddressUseCase;
        this.getCommunesUseCase = getCommunesUseCase;
    }

    @Override
    public Address createAddress(Address address) {
        return createAddressUseCase.createAddress(address);
    }

    @Override
    public Optional<Address> getAddressById(Long id) {
        return retrieveAddressUseCase.getAddressById(id);
    }

    @Override
    public List<Address> getAllAddress() {
        return retrieveAddressUseCase.getAllAddress();
    }

    @Override
    public Optional<Address> updateAddress(Long id, Address updatedAddress) {
        return updateAddressUseCase.updateAddress(id, updatedAddress);
    }

    @Override
    public boolean deleteAddress(Long id) {
        return deleteAddressUseCase.deleteAddress(id);
    }

    @Override
    public List<Communes> getCommunes() {
        return getCommunesUseCase.getCommunes();
    }
}
