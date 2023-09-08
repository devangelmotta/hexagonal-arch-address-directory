package com.challenge.address.infrastructure.controllers;

import com.challenge.address.domain.model.Address;
import com.challenge.address.domain.model.Communes;
import com.challenge.address.application.services.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Address> createAddress(@Valid @RequestBody Address address) {
        Address createdAddress = addressService.createAddress(address);
        return new ResponseEntity<>(createdAddress, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/{addressId}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long addressId) {
        return addressService.getAddressById(addressId)
                .map(address -> new ResponseEntity<>(address, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Address>> getAllAddress() {
        List<Address> addresses = addressService.getAllAddress();
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }
    @CrossOrigin
    @PutMapping("/{addressId}")
    public ResponseEntity<Address> updateAddress(@PathVariable Long addressId, @RequestBody Address updatedAddress) {
        return addressService.updateAddress(addressId, updatedAddress)
                .map(address -> new ResponseEntity<>(address, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @CrossOrigin
    @DeleteMapping("/{addressId}")
    public ResponseEntity<Void> deleteAddressById(@PathVariable Long addressId) {
        if (addressService.deleteAddress(addressId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @CrossOrigin
    @GetMapping("/communes")
    public ResponseEntity<List<Communes>> getCommunes() {
        List<Communes> communes = addressService.getCommunes();
        return new ResponseEntity<>(communes, HttpStatus.OK);
    }
}
