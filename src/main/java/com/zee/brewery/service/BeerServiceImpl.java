package com.zee.brewery.service;

import com.zee.brewery.web.modal.BeerDto;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

  @Override
  public BeerDto getBeerById(UUID beerId) {
    return BeerDto.builder()
        .id(UUID.randomUUID())
        .beerName("Old Mout Cider")
        .beerType("Cider")
        .build();
  }

  @Override
  public BeerDto saveNewBeer(BeerDto beerDto) {
    return BeerDto.builder()
        .id(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {
    //todo impl - would add new beer
  }

  @Override
  public void deleteById(UUID beerId) {
    log.debug("DELETING BEER");
  }
}
