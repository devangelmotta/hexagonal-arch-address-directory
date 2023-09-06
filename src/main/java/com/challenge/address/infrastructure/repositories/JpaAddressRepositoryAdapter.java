package com.challenge.address.infrastructure.repositories;

import com.challenge.address.domain.model.Address;
import com.challenge.address.domain.ports.out.AddressRepositoryPort;
import com.challenge.address.infrastructure.entities.AddressEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaAddressRepositoryAdapter implements AddressRepositoryPort {

    private final JpaAddressRepository jpaAddressRepository;

    public JpaAddressRepositoryAdapter(JpaAddressRepository jpaAddressRepository) {
        this.jpaAddressRepository = jpaAddressRepository;
    }

    @Override
    public Address save(Address address) {
        AddressEntity addressEntity = AddressEntity.fromDomainModel(address);
        AddressEntity savedAddressEntity = jpaAddressRepository.save(addressEntity);
        return savedAddressEntity.toDomainModel();
    }

    @Override
    public Optional<Address> findById(String id) {
        return jpaAddressRepository.findById(id).map(AddressEntity::toDomainModel);
    }

    @Override
    public List<Address> findAll() {
        return jpaAddressRepository.findAll().stream()
                .map(AddressEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Address> update(Address address) {
        if (jpaAddressRepository.existsById(address.getId())) {
            AddressEntity addressEntity = AddressEntity.fromDomainModel(address);
            AddressEntity updatedAddressEntity = jpaAddressRepository.save(addressEntity);
            return Optional.of(updatedAddressEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(String id) {
        if (jpaAddressRepository.existsById(id)) {
            jpaAddressRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
