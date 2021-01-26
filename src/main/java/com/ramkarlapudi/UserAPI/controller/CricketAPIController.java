package com.ramkarlapudi.UserAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ramkarlapudi.UserAPI.model.MyArrayListPlayersData;
import com.ramkarlapudi.UserAPI.model.PlayerProfile;

@RestController
@RequestMapping("/cricket")
public class CricketAPIController {

	@GetMapping("/search/{playerName}")
	public PlayerProfile getPlayer(@PathVariable("playerName") String playerName) {
		ResponseEntity<MyArrayListPlayersData> res = null;

		res = new RestTemplate().getForEntity("http://localhost:8080/livescore/search2/{playerName}",
				MyArrayListPlayersData.class, playerName);

		MyArrayListPlayersData profile = res.getBody();

		PlayerProfile pp = profile.getMap();
		return pp;

	}

}
