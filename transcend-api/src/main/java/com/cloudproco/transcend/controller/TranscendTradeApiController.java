package com.cloudproco.transcend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloudproco.transcend.custom.domain.PersonDetailsResponse;
import com.cloudproco.transcend.domain.Person;
import com.cloudproco.transcend.service.TranscendTradeApiService;

@RestController
@RequestMapping("/transcend")
public class TranscendTradeApiController {
	
	@Autowired
	private TranscendTradeApiService transcendTradeApiService;
	
	@GetMapping(path = "/personInfo")
	public ResponseEntity<Page<Person>> getAllInformation(
			@RequestParam(name = "searchParam", required = false) String searchParam,
			Pageable page) {
		try {
			Page<Person> personDetails = transcendTradeApiService.getPersonInformation(searchParam, page);
			if(personDetails != null) {
				return ResponseEntity.ok(personDetails);	
			}
			return ResponseEntity.noContent().build();
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		
	}
}
