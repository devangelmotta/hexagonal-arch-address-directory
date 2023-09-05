package com.challenge.address.infrastructure.config;

import com.challenge.address.application.usecases.*;
import com.challenge.address.infrastructure.repositories.JpaAddressRepositoryAdapter;
import com.challenge.address.application.services.AddressService;
import com.challenge.address.domain.ports.in.GetCommunesUseCase;
import com.challenge.address.domain.ports.out.AddressRepositoryPort;
import com.challenge.address.domain.ports.out.ExternalServicePort;
import com.challenge.address.infrastructure.adapters.ExternalServiceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public AddressService addressService(AddressRepositoryPort addressRepositoryPort, GetCommunesUseCase getCommunesUseCase) {
        return new AddressService(
                new CreateAddressUseCaseImpl(addressRepositoryPort),
                new RetrieveAddressUseCaseImpl(addressRepositoryPort),
                new UpdateAddressUseCaseImpl(addressRepositoryPort),
                new DeleteAddressUseCaseImpl(addressRepositoryPort),
                getCommunesUseCase
        );
    }

    @Bean
    public AddressRepositoryPort addressRepositoryPort(JpaAddressRepositoryAdapter jpaAddressRepositoryAdapter) {
        return jpaAddressRepositoryAdapter;
    }

    @Bean
    public GetCommunesUseCase getAdditionalAddressInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetCommunesUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }
}
