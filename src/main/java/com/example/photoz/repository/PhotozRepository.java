package com.example.photoz.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.photoz.model.Photo;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}
