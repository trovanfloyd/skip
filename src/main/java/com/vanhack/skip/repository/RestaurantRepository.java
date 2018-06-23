package com.vanhack.skip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vanhack.skip.domain.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
