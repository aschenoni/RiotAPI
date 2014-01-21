package com.aschenoni.RiotAPI;
import static org.junit.Assert.*;

import org.junit.Test;

public class URLmakerTest {

	@Test
	public void testChampion() {
		String server = "na";
		boolean freeChamps = false;
		String key = "64251506-c1f1-4dfc-84a2-fbac1c2bf70c";
		String url = URLmaker.champion(server, freeChamps, key);
		assertEquals("http://prod.api.pvp.net/api/lol/na/v1.1/champion?api_key=64251506-c1f1-4dfc-84a2-fbac1c2bf70c", url);
		freeChamps = true;
		url = URLmaker.champion(server, freeChamps, key);
		assertEquals("http://prod.api.pvp.net/api/lol/na/v1.1/champion?freeToPlay=true&api_key=64251506-c1f1-4dfc-84a2-fbac1c2bf70c", url);
	}

	@Test
	public void testGame() {
		String server = "na";
		int summonerID = 20961388;
		String key = "64251506-c1f1-4dfc-84a2-fbac1c2bf70c";
		String url = URLmaker.game(server, summonerID, key);
		assertEquals("http://prod.api.pvp.net/api/lol/na/v1.1/game/by-summoner/20961388/recent?api_key=64251506-c1f1-4dfc-84a2-fbac1c2bf70c", url);
	}

	@Test
	public void testLeague() {
		String server = "na";
		int summonerID = 20961388;
		String key = "64251506-c1f1-4dfc-84a2-fbac1c2bf70c";
		String url = URLmaker.league(server, summonerID, key);
		assertEquals("http://prod.api.pvp.net/api/na/v2.1/league/by-summoner/20961388?api_key=64251506-c1f1-4dfc-84a2-fbac1c2bf70c", url);
	}

	@Test
	public void testStats() {
		
		String server = "na";
		int summonerID = 20961388;
		int season = 3;
		boolean ranked = true;
		String key = "64251506-c1f1-4dfc-84a2-fbac1c2bf70c";
		
		String url = URLmaker.stats(server, summonerID, season, ranked, key);
		assertEquals("http://prod.api.pvp.net/api/lol/na/v1.1/stats/by-summoner/20961388/ranked?season=SEASON3&api_key=64251506-c1f1-4dfc-84a2-fbac1c2bf70c", url);
		ranked = false;
		url = URLmaker.stats(server, summonerID, season, ranked, key);
		assertEquals("http://prod.api.pvp.net/api/lol/na/v1.1/stats/by-summoner/20961388/summary?season=SEASON3&api_key=64251506-c1f1-4dfc-84a2-fbac1c2bf70c", url);
	}

	@Test
	public void testSummonerInfo() {
		
		String server = "na";
		int summonerID = 20961388;
		boolean runesOrMast = true;
		String key = "64251506-c1f1-4dfc-84a2-fbac1c2bf70c";
		String url = URLmaker.summonerInfo(server, summonerID, runesOrMast, key);
		System.out.println(url);
		runesOrMast = false;
		url = URLmaker.summonerInfo(server, summonerID, runesOrMast, key);
		System.out.println(url);
	}

	@Test
	public void testSummonerStringStringString() {
		String server = "na";
		String summonerName = "AisforCynics";
		String key = "64251506-c1f1-4dfc-84a2-fbac1c2bf70c";
		String url = URLmaker.summoner(server, summonerName, key);
		System.out.println(url);
	}

	@Test
	public void testSummonerStringIntString() {
		String server = "na";
		int summonerID = 20961388;
		String key = "64251506-c1f1-4dfc-84a2-fbac1c2bf70c";
		String url = URLmaker.summoner(server, summonerID, key);
		System.out.println(url);
	}

	@Test
	public void testListOfSummoners() {
		//fail("Not yet implemented");
	}

	@Test
	public void testTeam() {
		String server = "na";
		int summonerID = 20961388;
		String key = "64251506-c1f1-4dfc-84a2-fbac1c2bf70c";
		String url = URLmaker.team(server, summonerID, key);
		System.out.println(url);
	}

}
