package com.stc.repositry;

import org.springframework.data.repository.CrudRepository;

import com.stc.entities.Item;

public interface PermissionsRepository extends CrudRepository<Item, Long> {

}
