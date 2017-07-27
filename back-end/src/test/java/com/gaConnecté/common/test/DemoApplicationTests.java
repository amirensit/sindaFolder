package com.gaConnecté.common.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gaConnecté.common.DAO.UtilisateurRepository;
import com.gaConnecté.common.Entities.Utilisateur;



@RunWith(SpringRunner.class)
@SpringBootTest

public class DemoApplicationTests {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Test
	public void testLoadGames() {
		List<Utilisateur> utilisateurs = (ArrayList<Utilisateur>) utilisateurRepository.findAll();
		System.out.println("--------------" + utilisateurs.get(0).getNom().toString());
		// assertEquals("Did not get all games", 2, games.size());
	}

}