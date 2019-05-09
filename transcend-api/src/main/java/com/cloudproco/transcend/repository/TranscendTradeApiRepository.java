package com.cloudproco.transcend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cloudproco.transcend.custom.domain.PersonDetailsResponse;
import com.cloudproco.transcend.domain.Person;

@Repository
public interface TranscendTradeApiRepository extends PagingAndSortingRepository<Person, Long>{
	
	
	Page<Person> findByFirstName(@Param("searchParam") String searchParam, Pageable page);
	
	
	
//	Page<PersonDetailsResponse> findPersonDetailsWithSearch(@Param("searchParam") String searchParam, Pageable page);
	

}
