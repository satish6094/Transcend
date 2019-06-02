package com.cloudproco.transcend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.cloudproco.transcend.domain.Party;
import com.cloudproco.transcend.domain.QParty;

@Repository
public interface TranscendTradeApiRepository extends PagingAndSortingRepository<Party, Long> {

//	
//	Page<Party> findByPartyId(@Param("partyid") Long partyId, @Param("firstName") String firstName,
//			@Param("lastName") String lastName, @Param("address1") String address1, @Param("address2") String address2,
//			@Param("address3") String address3, @Param("city") String city, @Param("companyName") String companyName,
//			@Param("countryName") String countryName, @Param("pincode") String pincode, @Param("source") String source,
//			@Param("state") String state, Pageable page);
	
	Page<Party> findByPartyId(@Param("partyId") Long partyId, Pageable page);
}
