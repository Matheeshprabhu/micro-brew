package com.math.microbrew.web.controller;

import com.math.microbrew.services.BeerService;
import com.math.microbrew.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/brew/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

//    @GetMapping("/{beerId}")
//    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
//
//        return new ResponseEntity<>(beerService.getBeerbyId(beerId), HttpStatus.OK);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable int id){
        return new ResponseEntity<BeerDto>(beerService.getbyId(id), HttpStatus.BAD_REQUEST);
    }
}
