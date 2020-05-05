package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.model.Cryptocurrency;
import com.model.StatusUpdate;
import com.model.Converter;

@RestController
// COMMENTS: lets be explicit what path for this controller
public class CryptocurrencyRestController extends Thread{

	private final int numberOfCoinsToSearch = 10;
	private final Converter converter = new Converter(numberOfCoinsToSearch);
	private List<Cryptocurrency> listCrypto;

	// For original API all bitcoins
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cryptocurrency> getCryptocurrency() {
		// Convert the JSON data from multiple APIs to list of POJOs
		return converter.getListCrypto();
	}

	// Getting the mapping for by ID
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cryptocurrency getCryptocurrency(@PathVariable String id, HttpServletResponse response) {
		Cryptocurrency crypto = converter.getCryptocurrency(id);
		if (crypto == null) {
			response.setStatus(400);
		}
		return converter.getCryptocurrency(id);
	}

	@PostMapping(path = "/add")
	public Cryptocurrency addCoin() {
		List<StatusUpdate> statusUpdates = null;
		Cryptocurrency coin = new Cryptocurrency("fake", 2000, "fake", statusUpdates);
		List<Cryptocurrency> tempList = converter.getListCrypto();
		tempList.add(coin);
		converter.setListCrypto(tempList);
		return coin;
	}
}
