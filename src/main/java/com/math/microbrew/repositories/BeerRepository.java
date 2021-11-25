package com.math.microbrew.repositories;

import com.math.microbrew.web.model.BeerDto;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<BeerDto, UUID> {
}
