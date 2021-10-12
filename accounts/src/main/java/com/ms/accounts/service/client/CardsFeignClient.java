package com.ms.accounts.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ms.accounts.model.Cards;
import com.ms.accounts.model.Customer;

@FeignClient(name = "cards")
public interface CardsFeignClient {

	@PostMapping(value = "myCards", consumes = "application/json")
	List<Cards> getCardsDetails(@RequestBody Customer customer);
}
