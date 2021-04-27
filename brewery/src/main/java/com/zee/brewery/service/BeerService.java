package com.zee.brewery.service;

import com.zee.brewery.web.modal.BeerDto;
import java.util.UUID;

public interface BeerService {

  BeerDto getBeerById(UUID beerId);

  BeerDto saveNewBeer(BeerDto beerDto);

  void updateBeer(UUID beerId, BeerDto beerDto);

  void deleteById(UUID beerId);
}
