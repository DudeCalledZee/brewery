package com.zee.brewery.service.v2;

import com.zee.brewery.web.modal.v2.BeerDtoV2;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

  @Override
  public BeerDtoV2 getBeerById(UUID beerId) {
    return null;
  }

  @Override
  public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
    return null;
  }

  @Override
  public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

  }

  @Override
  public void deleteById(UUID beerId) {

  }
}
