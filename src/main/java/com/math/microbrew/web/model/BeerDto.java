package com.math.microbrew.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Repository
public class BeerDto {

    private UUID uuid;
    private int id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }
}
