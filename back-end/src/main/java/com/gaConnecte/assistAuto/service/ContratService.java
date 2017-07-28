package com.gaConnecte.assistAuto.service;

import java.util.List;

import com.gaConnecte.assistAuto.dto.ContratDTO;
import com.gaConnecte.assistAuto.entities.Contrat;

// TODO: Auto-generated Javadoc
/**
 * The Interface ContratService.
 */
public interface ContratService {
	
	/**
	 * Convert to entity.
	 *
	 * @param cDTO the c DTO
	 * @return the contrat
	 */
	public Contrat convertToEntity(ContratDTO cDTO);
	
	/**
	 * Convert to DTO.
	 *
	 * @param c the c
	 * @return the contrat DTO
	 */
	public ContratDTO convertToDTO(Contrat c);
	
	/**
	 * Convert list to entity.
	 *
	 * @param listContratDTO the list contrat DTO
	 * @return the list
	 */
	public List<Contrat> convertListToEntity(List<ContratDTO> listContratDTO);
	
	/**
	 * Convert list to DTO.
	 *
	 * @param listContrat the list contrat
	 * @return the list
	 */
	public List<ContratDTO> convertListToDTO(List<Contrat> listContrat);
	
	//public ContratDTO addContrat(Contrat c,Long id_pack,Long id_Marque);
	
	/**
	 * Adds the contrat.
	 *
	 * @param cDTO the c DTO
	 * @return the contrat DTO
	 */
	public ContratDTO addContrat(ContratDTO cDTO);
	
	/**
	 * Edits the contrat.
	 *
	 * @param cDTO the c DTO
	 * @param id the id
	 * @return the contrat DTO
	 */
	public ContratDTO editContrat (ContratDTO cDTO,Long id);
	
	/**
	 * List contrat DTO.
	 *
	 * @return the list
	 */
	public List<ContratDTO> listContratDTO();
	
}
