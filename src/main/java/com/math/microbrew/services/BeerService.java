package com.math.microbrew.services;

import com.math.microbrew.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerbyId(UUID uuid);
}
