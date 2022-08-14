package com.amanuel.aregay.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amanuel.aregay.data.Item;

public interface ItemRepository extends MongoRepository<Item, Integer> {

}
