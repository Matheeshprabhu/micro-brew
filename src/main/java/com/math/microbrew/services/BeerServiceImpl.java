package com.math.microbrew.services;

import com.math.microbrew.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerbyId(UUID uuid) {
        return BeerDto.builder().uuid(uuid).beerName("Kingfisher").beerStyle("can").build();
    }
}
