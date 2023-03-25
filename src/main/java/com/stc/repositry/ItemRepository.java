package com.stc.repositry;

import org.springframework.data.repository.CrudRepository;

import com.stc.entities.Permissions;

public interface ItemRepository extends CrudRepository<Permissions, Long> {

}
