package com.math.microbrew.services;

import com.math.microbrew.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerbyId(UUID uuid) {
        return BeerDto.builder().uuid(uuid).beerName("Kingfisher").beerStyle("can").build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().uuid(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerDto) {
        log.info("updated Beer");
    }

    @Override
    public void deleteBeer(UUID beerDto) {
        log.info("Deleted Beer");
    }
}
