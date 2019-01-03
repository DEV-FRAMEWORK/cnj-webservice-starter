package com.cnj.rest.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cnj.rest.domain.RestApi;


public interface RestApiRepository extends JpaRepository<RestApi, Long> { 

	//  List<RestApi> findByCreatedAfter(Date date);
	
	// @Query("select j from restapi j where j.api_name like %?1%")
	// List<RestApi> findByCustomQuery(String content);

}
