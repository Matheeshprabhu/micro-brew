package com.math.microbrew.services;

import com.math.microbrew.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {
//    @Override
//    public BeerDto getBeerbyId(UUID uuid) {
//        return BeerDto.builder().uuid(uuid).beerName("Kingfisher").beerStyle("can").build();
//    }

    private final BeerDto beerDto;

    public BeerServiceImpl(BeerDto beerDto) {
        this.beerDto = beerDto;
    }

    @Override
    public BeerDto getbyId(int id) {
        beerDto.setBeerName("kingfisher");
        beerDto.setBeerStyle("tin");
        beerDto.setId(id);
        return beerDto;
    }

}
