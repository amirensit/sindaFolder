package com.gaConnecte.assistAuto.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaConnecte.assistAuto.daos.PackRepository;
import com.gaConnecte.assistAuto.dto.ClientDTO;
import com.gaConnecte.assistAuto.dto.PackDTO;
import com.gaConnecte.assistAuto.entities.Client;
import com.gaConnecte.assistAuto.entities.Pack;
import com.gaConnecte.assistAuto.service.PackService;

// TODO: Auto-generated Javadoc
/**
 * The Class PackController.
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/packs")
public class PackController {

	/** The pack service. */
	@Autowired
	private PackService packService;
	
	/** The pack repository. */
	@Autowired
	private PackRepository packRepository;
	
	
	/**
	 * Adds the client.
	 *
	 * @param pDTO the dto
	 * @return the pack DTO
	 */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public PackDTO addClient(@RequestBody PackDTO pDTO) {
		
		
		return packService.addPack(pDTO);
	}
	
	
	/**
	 * Update.
	 *
	 * @param pDTO the dto
	 * @param id the id
	 * @return the pack DTO
	 */
	@RequestMapping(value="edit/{id}",method=RequestMethod.PUT) 
	public PackDTO update(@RequestBody   PackDTO pDTO,@PathVariable Long id)
	{
		return packService.editPack(pDTO, id);
	}
	
	
	
	/**
	 * Delete pack.
	 *
	 * @param id_user the id user
	 */
	@RequestMapping(value = "delete/{id_user}", method = RequestMethod.DELETE)

	public void deletePack(@PathVariable Long id_user) {

		packService.deletePack(id_user);

		}	
	
	
	
	/**
	 * Enable pack.
	 *
	 * @param id_user the id user
	 */
	@RequestMapping(value = "enable/{id_user}", method = RequestMethod.PUT)
	public void enablePack(@PathVariable Long id_user) {

		packService.enableEtatPack(id_user);

		}
	
	
	/**
	 * Disable client.
	 *
	 * @param id_user the id user
	 */
	@RequestMapping(value = "disable/{id_user}", method = RequestMethod.PUT)
	public void disableClient(@PathVariable Long id_user) {

		packService.disableEtatPack(id_user);

		}
	
	
	/**
	 * Gets the list pack.
	 *
	 * @return the list pack
	 */
	@RequestMapping(value = "getListPack", method = RequestMethod.GET)
	public List<PackDTO> getListPack()
	{
		List<Pack> listPack=packService.listPack();
		List<PackDTO> packDTOList =packService.convertToDTO(listPack);
		
		return packDTOList;
	}
	
	/**
	 * Gets the pack.
	 *
	 * @param id_pack the id pack
	 * @return the pack
	 */
	@RequestMapping(value = "/{id_pack}", method = RequestMethod.GET)
	public PackDTO getPack(@PathVariable Long id_pack)
	{
		//Pack pack=packService.listPack();
		Pack pack=packRepository.findOne(id_pack);
		PackDTO packDTO =packService.convertToDTO(pack);
		
		return packDTO;
	}
	
	
}
