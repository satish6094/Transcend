package com.cloudproco.transcend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cloudproco.transcend.custom.domain.PersonDetailsResponse;
import com.cloudproco.transcend.domain.Person;
import com.cloudproco.transcend.repository.TranscendTradeApiRepository;

@Service
public class TranscendTradeApiServiceImpl implements TranscendTradeApiService {
	
	@Autowired
	TranscendTradeApiRepository transcendRepository;

	public Page<Person> getPersonInformation(String searchParam, Pageable page){
		try {
			return transcendRepository.findByFirstName(searchParam, page);
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
}
