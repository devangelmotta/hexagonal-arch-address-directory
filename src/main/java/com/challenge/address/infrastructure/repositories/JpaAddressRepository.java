package com.challenge.address.infrastructure.repositories;

import com.challenge.address.infrastructure.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAddressRepository extends JpaRepository<AddressEntity, Long> {
}
