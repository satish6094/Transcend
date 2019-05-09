package com.cloudproco.transcend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cloudproco.transcend.custom.domain.PersonDetailsResponse;
import com.cloudproco.transcend.domain.Person;

@Service
public interface TranscendTradeApiService {

	Page<Person> getPersonInformation(String searchParam, Pageable page);
}
