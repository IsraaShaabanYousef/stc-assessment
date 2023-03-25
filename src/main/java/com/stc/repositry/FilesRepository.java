package com.stc.repositry;

import org.springframework.data.repository.CrudRepository;

import com.stc.entities.Files;


public interface FilesRepository extends CrudRepository<Files, Long> {

}
