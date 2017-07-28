package com.gaConnecte.assistAuto.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaConnecte.assistAuto.daos.ClientRepository;
import com.gaConnecte.assistAuto.dto.ClientDTO;
import com.gaConnecte.assistAuto.dto.PackDTO;
import com.gaConnecte.assistAuto.entities.Client;
import com.gaConnecte.assistAuto.service.ClientService;



// TODO: Auto-generated Javadoc
/**
 * The Class ClientController.
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/clients")
public class ClientController {
	
	/** The client service. */
	@Autowired
	private ClientService clientService;
	
	/** The client repository. */
	@Autowired
	private ClientRepository clientRepository;

	/**
	 * Adds the client.
	 *
	 * @param ud the ud
	 * @return the client DTO
	 */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ClientDTO addClient(@RequestBody ClientDTO ud) {
		System.out.println(ud.getPacks()+"\n" );
		//System.out.println(ud.getP().getNom_pack()+"\n" );
		return clientService.addClient(ud);
		
	}
	
	/*@RequestMapping(value="/all",method = RequestMethod.GET)
	public List<ClientDTO> getAllClient() {
		
		List<Client> u=clientService.listClient();
		List<ClientDTO> ud =clientService.convertToDTO(u);
		return ud;
		
	}*/
	
	/**
	 * List client.
	 *
	 * @return the list
	 */
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<ClientDTO> listClient() {
		List<Client> r=clientService.listClient();
		List<ClientDTO> rd =clientService.convertToDTO(r);
		return rd;
		
	}
	
	/**
	 * Update.
	 *
	 * @param cDTO the c DTO
	 * @param id the id
	 * @return the client DTO
	 */
	@RequestMapping(value="edit/{id}",method=RequestMethod.PUT) 
	public ClientDTO update(@RequestBody   ClientDTO cDTO,@PathVariable Long id)
	{
		return clientService.editClient(cDTO, id);
	}
	
	
	/**
	 * Delete client.
	 *
	 * @param id_user the id user
	 */
	@RequestMapping(value = "delete/{id_user}", method = RequestMethod.DELETE)

	public void deleteClient(@PathVariable Long id_user) {

		clientService.deleteClient(id_user);

		}	
	
	/**
	 * Enable client.
	 *
	 * @param id_user the id user
	 */
	@RequestMapping(value = "enable/{id_user}", method = RequestMethod.PUT)
	public void enableClient(@PathVariable Long id_user) {

		clientService.enableEtatClient(id_user);

		}
	
	
	/**
	 * Disable client.
	 *
	 * @param id_user the id user
	 */
	@RequestMapping(value = "disable/{id_user}", method = RequestMethod.PUT)
	public void disableClient(@PathVariable Long id_user) {

		clientService.disableEtatClient(id_user);

		}	
	
	
	/**
	 * Gets the client.
	 *
	 * @param id_client the id client
	 * @return the client
	 */
	@RequestMapping(value="/{id_client}",method=RequestMethod.GET)
	public ClientDTO getClient(@PathVariable Long id_client)
	{
		Client client=clientRepository.findOne(id_client);
		return clientService.convertToDTO(client);
	}
	
	/**
	 * Verifier deja exist.
	 *
	 * @param num_client the num client
	 * @return the string
	 */
	@RequestMapping(value="/verifierDejaExist/{num_client}",method=RequestMethod.GET)
	public String verifierDejaExist(@PathVariable Long num_client)
	{
		Client c=clientRepository.verifierDejaExist(num_client);
		//System.out.println(c.getNom_client());
		 if ( c !=null) return "existe";
		 return "cv";
		
	}
	
	
	
}
