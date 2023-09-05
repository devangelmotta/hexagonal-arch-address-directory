package com.challenge.address.infrastructure.adapters;

import com.challenge.address.domain.model.Communes;
import com.challenge.address.domain.ports.out.ExternalServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ExternalServiceAdapter implements ExternalServicePort {

    @Autowired
    private ExternalServicePort externalServicePort;

    @Override
    public List<Communes> getCommunes() {
        return externalServicePort.getCommunes();
    }
}
