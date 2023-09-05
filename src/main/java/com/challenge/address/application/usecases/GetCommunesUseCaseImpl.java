package com.challenge.address.application.usecases;

import com.challenge.address.domain.model.Communes;
import com.challenge.address.domain.ports.in.GetCommunesUseCase;
import com.challenge.address.domain.ports.out.ExternalServicePort;

import java.util.List;

public class GetCommunesUseCaseImpl implements GetCommunesUseCase {

    private final ExternalServicePort externalServicePort;

    public GetCommunesUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public List<Communes> getCommunes() {
        return externalServicePort.getCommunes();
    }
}
