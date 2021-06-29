package com.zee.brewery.web.mappers;

import com.zee.brewery.domain.Beer;
import com.zee.brewery.web.modal.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beetToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
