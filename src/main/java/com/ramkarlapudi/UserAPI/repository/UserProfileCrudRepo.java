package com.ramkarlapudi.UserAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ramkarlapudi.UserAPI.entity.UserProfileEntity;

@Repository
public interface UserProfileCrudRepo extends CrudRepository<UserProfileEntity, Integer> {

}
