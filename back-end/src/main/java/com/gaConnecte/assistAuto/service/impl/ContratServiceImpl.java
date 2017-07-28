package com.gaConnecte.assistAuto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.gaConnecte.assistAuto.daos.ContratRepository;
import com.gaConnecte.assistAuto.daos.MarqueRepository;
import com.gaConnecte.assistAuto.daos.PackRepository;
import com.gaConnecte.assistAuto.dto.ContratDTO;
import com.gaConnecte.assistAuto.dto.MarqueDTO;
import com.gaConnecte.assistAuto.dto.PackDTO;
import com.gaConnecte.assistAuto.dto.RemorqueurDTO;
import com.gaConnecte.assistAuto.dto.VilleDTO;
import com.gaConnecte.assistAuto.entities.Contrat;
import com.gaConnecte.assistAuto.entities.Marque;
import com.gaConnecte.assistAuto.entities.Pack;
import com.gaConnecte.assistAuto.entities.Remorqueur;
import com.gaConnecte.assistAuto.entities.Ville;
import com.gaConnecte.assistAuto.service.ContratService;
import com.gaConnecte.assistAuto.service.MarqueService;
import com.gaConnecte.assistAuto.service.PackService;
import com.gaConnecte.assistAuto.service.VilleService;

// TODO: Auto-generated Javadoc
/**
 * The Class ContratServiceImpl.
 */
@Service
public class ContratServiceImpl implements ContratService {
	
	/**
	 * Model mapper.
	 *
	 * @return the model mapper
	 */
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	/** The model mapper. */
	private ModelMapper modelMapper = new ModelMapper();
	
	/** The pack service. */
	@Autowired
	private PackService packService;
	
	/** The marque service. */
	@Autowired
	private MarqueService marqueService;
	
	/** The contrat repository. */
	@Autowired
	private ContratRepository contratRepository;
	
	/** The pack repository. */
	@Autowired
	private PackRepository  packRepository;

	/** The ville service. */
	@Autowired
	private VilleService villeService;
	
	/** The marque repository. */
	@Autowired
	private MarqueRepository marqueRepository;
	
	
	
	
	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.ContratService#convertToDTO(com.gaConnecte.assistAuto.entities.Contrat)
	 */
	@Override
	public ContratDTO convertToDTO(Contrat c) {
		//Pack p = c.getPack();
		//Marque m=c.getMarque();
		//PackDTO pDTO=packService.convertToDTO(p);
		//MarqueDTO mDTO=marqueService.convertToDTO(m);
		ContratDTO cDTO = modelMapper.map(c, ContratDTO.class);
		//cDTO.setPackDTO(pDTO);
		//cDTO.setMarqueDTO(mDTO);
		return cDTO;
	}
	
	
	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.ContratService#convertToEntity(com.gaConnecte.assistAuto.dto.ContratDTO)
	 */
	@Override
	public Contrat convertToEntity(ContratDTO cDTO) {
		PackDTO pDTO=null;
		pDTO=cDTO.getPackDTO();
		MarqueDTO mDTO=null;
		mDTO=cDTO.getMarqueDTO();
		VilleDTO vDTO=null;
		 vDTO=cDTO.getVilleDTO();
		Ville v=villeService.convertToEntity(vDTO);
		Pack p = packService.convertToEntity(pDTO) ;
		Marque m= marqueService.convertToEntity(mDTO);
		Contrat r=modelMapper.map(cDTO, Contrat.class);
		r.setPack(p);
		r.setMarque(m);
		r.setVille(v);
		
		return r;
	}


	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.ContratService#convertListToEntity(java.util.List)
	 */
	@Override
	public List<Contrat> convertListToEntity(List<ContratDTO> listContratDTO) {
		List<Contrat> listContrat=new ArrayList<Contrat>();
		for (ContratDTO entity : listContratDTO) {
			Contrat p = convertToEntity(entity);
			listContrat.add(p);
		}
		return listContrat;
	}


	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.ContratService#convertListToDTO(java.util.List)
	 */
	@Override
	public List<ContratDTO> convertListToDTO(List<Contrat> listContrat) {
		/*List<ContratDTO> objDtoList = new ArrayList<ContratDTO>();
		ContratDTO objDto = null;
		for (Contrat entity : listContrat) {
			
				ContratDTO mdto= this.convertToDTO(entity);
				objDtoList.add(mdto);
		}
		return objDtoList;*/
		
		List<ContratDTO> listContratDTO = new ArrayList<ContratDTO>();
		ContratDTO contratDTO = null;
		for (Contrat contrat : listContrat) {
			Ville ville=contrat.getVille();
			VilleDTO villeDTO= villeService.convertToDTO(ville);
			Pack pack=contrat.getPack();
			Marque marque=contrat.getMarque();
			PackDTO packDTO=packService.convertToDTO(pack);
			
			MarqueDTO marqueDTO=marqueService.convertToDTO(marque);
			
			contratDTO = convertToDTO(contrat);
			
			contratDTO.setVilleDTO(villeDTO);
			contratDTO.setMarqueDTO(marqueDTO);
			contratDTO.setPackDTO(packDTO);
			listContratDTO.add(contratDTO);
		}
		return listContratDTO;
				
		
	}


	/*@Override
	public ContratDTO addContrat(Contrat c, Long id_pack, Long id_Marque) {
		
		//Pack p =packRepository.findOne(id_pack);
		//Marque m =marqueRepository.findOne(id_Marque);
		
		//PackDTO pDTO=packService.convertToDTO(p);
		//MarqueDTO mDTO=marqueService.convertToDTO(m);
		ContratDTO cDTO=convertToDTO(c);
		//cDTO.setPackDTO(pDTO);
		//cDTO.setMarqueDTO(mDTO);
		//contratRepository.save(convertToEntity(cDTO));
		contratRepository.save(c);
		return cDTO;
		}*/
	
	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.ContratService#addContrat(com.gaConnecte.assistAuto.dto.ContratDTO)
	 */
	@Override
	public ContratDTO addContrat(ContratDTO cDTO) {
		
		Contrat c=convertToEntity(cDTO);
		
		contratRepository.save(c);
	
		return cDTO;
		}


	
	
	
	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.ContratService#editContrat(com.gaConnecte.assistAuto.dto.ContratDTO, java.lang.Long)
	 */
	@Override
	public ContratDTO editContrat(ContratDTO cDTO, Long id) {
		cDTO.setId_contrat(id);
		Contrat c = new Contrat();
		c= convertToEntity(cDTO);
		contratRepository.saveAndFlush(c);
		return cDTO;
	}


	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.ContratService#listContratDTO()
	 */
	@Override
	public List<ContratDTO> listContratDTO() {
		List<Contrat> listContrat=contratRepository.findAll();
		List<ContratDTO> listContratDTO = convertListToDTO(listContrat);
		return listContratDTO;
	}


	

	


}
