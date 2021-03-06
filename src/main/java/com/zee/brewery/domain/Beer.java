package com.zee.brewery.domain;

import com.zee.brewery.web.modal.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerType;
    private Long upc;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;
}
