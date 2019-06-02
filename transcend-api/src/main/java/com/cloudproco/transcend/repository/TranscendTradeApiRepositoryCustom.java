package com.cloudproco.transcend.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cloudproco.transcend.domain.Party;
import com.cloudproco.transcend.domain.QParty;
import com.querydsl.core.types.dsl.StringPath;

public interface TranscendTradeApiRepositoryCustom extends PagingAndSortingRepository<Party, Long>, QueryDslPredicateExecutor<Party>,QuerydslBinderCustomizer<QParty> {

	
	@Override
	  default void customize(QuerydslBindings bindings, QParty party) {

	    bindings.bind(party.firstName).first((path, value) -> path.containsIgnoreCase(value))  ; 
	    bindings.bind(String.class)
	      .first((StringPath path, String value) -> path.containsIgnoreCase(value)); 
	                                             
	  }
}
