package com.ramkarlapudi.UserAPI.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ramkarlapudi.UserAPI.entity.UserProfileEntity;

@Repository
public interface UserProfileSortandPagingRepo extends PagingAndSortingRepository<UserProfileEntity, Integer> {

	
}
