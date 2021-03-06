package com.math.microbrew.web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID uuid;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
