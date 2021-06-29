package com.zee.brewery.service.v2;

import com.zee.brewery.web.modal.v2.BeerDtoV2;
import java.util.UUID;

public interface BeerServiceV2 {
  BeerDtoV2 getBeerById(UUID beerId);

  BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

  void updateBeer(UUID beerId, BeerDtoV2 beerDto);

  void deleteById(UUID beerId);
}
