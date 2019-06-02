package com.cloudproco.transcend.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cloudproco.model.PartyMetaData;
import com.cloudproco.transcend.custom.domain.PartyDetailsResponse;
import com.cloudproco.transcend.domain.Party;
import com.cloudproco.transcend.domain.QParty;
import com.cloudproco.transcend.repository.TranscendTradeApiRepository;
import com.cloudproco.transcend.repository.TranscendTradeApiRepositoryCustom;
import com.querydsl.core.BooleanBuilder;

@Service
public class TranscendTradeApiServiceImpl implements TranscendTradeApiService {

	@Autowired
	TranscendTradeApiRepositoryCustom transcendRepository;
	
	/**
	 *  Method to get the party information from the db based on the party id.
	 *  return Pageable object
	 */
	public Page<PartyDetailsResponse> getPartyInformation(PartyMetaData partyMataData, Pageable page) {
		try {
//			return transcendRepository.findByPartyId(partyMataData.getPartyId(), page).map(this::convertToPartyDetailsResponse);
			
			BooleanBuilder builder = new BooleanBuilder();
			QParty party = QParty.party;
			
			if(StringUtils.isNotBlank(partyMataData.getFirstName())) {
				builder.or(party.firstName.containsIgnoreCase(partyMataData.getFirstName()));
			}
			if(StringUtils.isNotBlank(partyMataData.getLastName())) {
				builder.or(party.lastName.containsIgnoreCase(partyMataData.getLastName()));
			}
			if(StringUtils.isNotBlank(partyMataData.getAddress1())) {
				builder.or(party.addressLine1.containsIgnoreCase(partyMataData.getAddress1()));
			}
			if(StringUtils.isNotBlank(partyMataData.getAddress2())) {
				builder.or(party.addressLine2.containsIgnoreCase(partyMataData.getAddress2()));
			}
			if(StringUtils.isNotBlank(partyMataData.getAddress3())) {
				builder.or(party.addressLine3.containsIgnoreCase(partyMataData.getAddress3()));
			}
			if(StringUtils.isNotBlank(partyMataData.getCity())) {
				builder.or(party.city.containsIgnoreCase(partyMataData.getCity()));
			}
			if(StringUtils.isNotBlank(partyMataData.getCompanyName())) {
				builder.or(party.companyName.containsIgnoreCase(partyMataData.getCompanyName()));
			}
			if(StringUtils.isNotBlank(partyMataData.getCountryName())) {
				builder.or(party.country2.containsIgnoreCase(partyMataData.getCountryName()));
			}
			if(StringUtils.isNotBlank(partyMataData.getPinCode())) {
				builder.or(party.postalCode.containsIgnoreCase(partyMataData.getPinCode()));
			}
			if(StringUtils.isNotBlank(partyMataData.getSource())) {
				builder.or(party.listSource.containsIgnoreCase(partyMataData.getSource()));
			}
			if(StringUtils.isNotBlank(partyMataData.getState())) {
				builder.or(party.state.containsIgnoreCase(partyMataData.getState()));
			}
			
			
			return transcendRepository.findAll(builder, page).map(this::convertToPartyDetailsResponse);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	private PartyDetailsResponse convertToPartyDetailsResponse(Party p) {
		return new PartyDetailsResponse(p.getPartyId().toString(), p.getFirstName(), p.getLastName(), p.getCompanyName(), p.getAddressLine1(), p.getAddressLine2(), p.getAddressLine3(), p.getCity(), p.getState(), p.getPostalCode(), p.getCountry2(), p.getListSource());
	}
}
