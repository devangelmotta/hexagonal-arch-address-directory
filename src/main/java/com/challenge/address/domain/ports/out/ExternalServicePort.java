package com.challenge.address.domain.ports.out;

import com.challenge.address.domain.model.Communes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@FeignClient(name = "communesClient", url = "https://private-anon-53deb82188-gonzalobulnes.apiary-mock.com")
public interface ExternalServicePort  {

    @GetMapping("/comunas")
    List<Communes> getCommunes();
}


