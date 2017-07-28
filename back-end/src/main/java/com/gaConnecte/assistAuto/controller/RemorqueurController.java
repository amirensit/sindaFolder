package com.gaConnecte.assistAuto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaConnecte.assistAuto.daos.RemorqueurRepository;
import com.gaConnecte.assistAuto.dto.ClientDTO;
import com.gaConnecte.assistAuto.dto.ContratDTO;
import com.gaConnecte.assistAuto.dto.PackDTO;
import com.gaConnecte.assistAuto.dto.RemorqueurDTO;
import com.gaConnecte.assistAuto.entities.Client;
import com.gaConnecte.assistAuto.entities.Remorqueur;
import com.gaConnecte.assistAuto.service.RemorqueurService;

// TODO: Auto-generated Javadoc
/**
 * The Class RemorqueurController.
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/remorqueurs")
public class RemorqueurController {
	
	/** The remorqueur service. */
	@Autowired
	private RemorqueurService remorqueurService;
	
	/** The remorqueur repository. */
	@Autowired
	private RemorqueurRepository remorqueurRepository;
	
	
	/**
	 * Adds the remorqueur.
	 *
	 * @param remorqueurDTO the remorqueur DTO
	 * @return the remorqueur DTO
	 */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public RemorqueurDTO addRemorqueur(@RequestBody RemorqueurDTO remorqueurDTO) {
		
		
		return remorqueurService.addRemorqueur(remorqueurDTO);
	}
	
	/**
	 * Enable remorqueur.
	 *
	 * @param id_remorqueur the id remorqueur
	 */
	@RequestMapping(value = "enable/{id_remorqueur}", method = RequestMethod.PUT)
	public void enableRemorqueur(@PathVariable Long id_remorqueur) {

		remorqueurService.enableEtatRemorqueur(id_remorqueur);

		}
	
	
	/**
	 * Disable remorqueur.
	 *
	 * @param id_remorqueur the id remorqueur
	 */
	@RequestMapping(value = "disable/{id_remorqueur}", method = RequestMethod.PUT)
	public void disableRemorqueur(@PathVariable Long id_remorqueur) {

		remorqueurService.disableEtatRemorqueur(id_remorqueur);

		}
	
	
	/**
	 * Delete remorqueur.
	 *
	 * @param id_remorqueur the id remorqueur
	 */
	@RequestMapping(value = "delete/{id_remorqueur}", method = RequestMethod.DELETE)

	public void deleteRemorqueur(@PathVariable Long id_remorqueur) {

		remorqueurService.deleteRemorqueur(id_remorqueur);

		}
	

	/**
	 * Update.
	 *
	 * @param remorqueurDTO the remorqueur DTO
	 * @param id_remorqueur the id remorqueur
	 * @return the remorqueur DTO
	 */
	@RequestMapping(value="edit/{id_remorqueur}",method=RequestMethod.PUT) 
	public RemorqueurDTO update(@RequestBody   RemorqueurDTO remorqueurDTO,@PathVariable Long id_remorqueur)
		{
			return remorqueurService.editRemorqueur(remorqueurDTO, id_remorqueur);
		}
	
	/**
	 * List remorqueur DTO.
	 *
	 * @return the list
	 */
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<RemorqueurDTO> listRemorqueurDTO() {
		List<Remorqueur> listRemorqueur=remorqueurRepository.findAll();
		List<RemorqueurDTO> listRemorqueurDTO =remorqueurService.convertlistDTO(listRemorqueur);
		
		return listRemorqueurDTO;
		
	}
	
	/**
	 * Gets the remorqueur.
	 *
	 * @param id_remorqueur the id remorqueur
	 * @return the remorqueur
	 */
	@RequestMapping(value="/{id_remorqueur}",method=RequestMethod.GET)
	public RemorqueurDTO getRemorqueur(@PathVariable Long id_remorqueur)
	{
		Remorqueur remorqueur=remorqueurRepository.findOne(id_remorqueur);
		return remorqueurService.convertToDTO(remorqueur);
	}
	
	

}
