package com.challenge.address.domain.ports.in;

import com.challenge.address.domain.model.Communes;

import java.util.List;

public interface GetCommunesUseCase {
    List<Communes> getCommunes();
}
