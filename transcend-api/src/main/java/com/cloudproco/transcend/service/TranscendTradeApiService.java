package com.cloudproco.transcend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cloudproco.model.PartyMetaData;
import com.cloudproco.transcend.custom.domain.PartyDetailsResponse;
import com.cloudproco.transcend.domain.Party;

@Service
public interface TranscendTradeApiService {

	Page<PartyDetailsResponse> getPartyInformation( PartyMetaData partyMataData, Pageable page);
	Float performDiceMatch(String gtmParty,String restrictedParty,Pageable page);
}
