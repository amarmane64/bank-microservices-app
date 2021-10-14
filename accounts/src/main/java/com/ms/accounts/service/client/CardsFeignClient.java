package com.ms.accounts.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.ms.accounts.model.Cards;
import com.ms.accounts.model.Customer;

@FeignClient(name = "cards")
public interface CardsFeignClient {

	@PostMapping(value = "myCards", consumes = "application/json")
	List<Cards> getCardDetails(@RequestHeader("eazybank-correlation-id") String correlationid, @RequestBody Customer customer);
}
