package com.ramkarlapudi.UserAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ramkarlapudi.UserAPI.entity.UserProfileEntity;

@EnableJpaRepositories
@Repository
public interface UserProfileRepo extends JpaRepository<UserProfileEntity, Integer> {

	@Transactional
	@Modifying
	@Query("UPDATE UserProfileEntity SET verified='YES' where userid=?1")
	public void updateprofile(int userid);
	
	@Query("select U from UserProfileEntity U where  U.username=?1")
	public UserProfileEntity findByUserName(String username );

}
