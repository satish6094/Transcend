package com.cloudproco.transcend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.cloudproco.model.PartyMetaData;
import com.cloudproco.transcend.custom.domain.PartyDetailsResponse;
import com.cloudproco.transcend.domain.Party;
import com.cloudproco.transcend.service.TranscendTradeApiService;

@RestController
@RequestMapping("/transcend")
public class TranscendTradeApiController {
	
	@Autowired
	private TranscendTradeApiService transcendTradeApiService;
	
	@PostMapping(path = "/partyInfo")
	public ResponseEntity<Page<PartyDetailsResponse>> getAllInformation(@RequestPart("partyMetaData") PartyMetaData partyMetaData, Pageable page) {
		try {
			Page<PartyDetailsResponse> personDetails = transcendTradeApiService.getPartyInformation(partyMetaData, page);
			if(personDetails != null) {
				return ResponseEntity.ok(personDetails);	
			}
			return ResponseEntity.noContent().build();
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	@GetMapping("/dicematch")
	public ResponseEntity<Float> performDiceAlgorithim(@RequestParam(value = "gtmParty", required = false) String gtmParty,@RequestParam(value = "restrictedParty", required = false) String restrictedParty,Pageable page){
		try {
			Float diceCofResponse=transcendTradeApiService.performDiceMatch(gtmParty, restrictedParty, page);
			if(diceCofResponse != null) {
				return ResponseEntity.ok(diceCofResponse);
			}else {
				ResponseEntity.noContent().build();
			}
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		return null;
	}
	
	@PostMapping("/partyInfo/dicematch")
	public ResponseEntity<Page<PartyDetailsResponse>> getAllInfoWithDiceAlgo(@RequestPart("partyMetaData") PartyMetaData partyMetaData,@RequestParam(value = "matchFactor", required = false) float matchFactor,Pageable page){
		try {
			Page<PartyDetailsResponse> personDetails = transcendTradeApiService.getPartyInformationWithDiceMatch(partyMetaData, matchFactor, page);
			if(personDetails != null) {
				return ResponseEntity.ok(personDetails);	
			}
			return ResponseEntity.noContent().build();
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
}
