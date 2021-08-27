package com.udacity.pricing.domain.price;

import org.springframework.data.repository.CrudRepository;

public interface PriceRepo  extends CrudRepository<Price, Long> {
}
