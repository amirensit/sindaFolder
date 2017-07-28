package com.gaConnecte.assistAuto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaConnecte.assistAuto.daos.PackRepository;
import com.gaConnecte.assistAuto.dto.PackDTO;
import com.gaConnecte.assistAuto.entities.Pack;
import com.gaConnecte.assistAuto.service.PackService;




// TODO: Auto-generated Javadoc
/**
 * The Class PackServiceImpl.
 */
@Transactional
@Service
public class PackServiceImpl implements PackService {
	
	
	/** The pack repository. */
	@Autowired
	private PackRepository packRepository;
	
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
	
	
	

	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#convertToDTO(com.gaConnecte.assistAuto.entities.Pack)
	 */
	@Override
	public PackDTO convertToDTO(Pack entity) {
		PackDTO roleDTO = modelMapper.map(entity, PackDTO.class);
		return roleDTO;
	}

	

	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#convertToDTO(java.util.List)
	 */
	@Override
	public List<PackDTO> convertToDTO(List<Pack> listPack) {
		List<PackDTO> listPackDTO=new ArrayList<PackDTO>();
		for (Pack entity : listPack) {
			PackDTO p = convertToDTO(entity);
			listPackDTO.add(p);
		}
		return listPackDTO;
	}

	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#convertToEntity(java.util.List)
	 */
	@Override
	public List<Pack> convertToEntity(List<PackDTO> listPackDTO) {
		
		List<Pack> listPack=new ArrayList<Pack>();
		for (PackDTO entity : listPackDTO) {
			Pack p = convertToEntity(entity);
			listPack.add(p);
		}
		return listPack;
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#convertToEntity(com.gaConnecte.assistAuto.dto.PackDTO)
	 */
	@Override
	public Pack convertToEntity(PackDTO pd) {
		
		Pack r=modelMapper.map(pd, Pack.class);
		return r;
	}



	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#addPack(com.gaConnecte.assistAuto.dto.PackDTO)
	 */
	@Override
	public PackDTO addPack(PackDTO pDTO) {
		Pack p = convertToEntity(pDTO);
		packRepository.save(p);
		return pDTO;
	}



	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#convertListToDTO(java.util.List)
	 */
	@Override
	public List<PackDTO> convertListToDTO(List<Pack> m) {
		
			List<PackDTO> objDtoList = new ArrayList<PackDTO>();
			PackDTO objDto = null;
			for (Pack entity : m) {
				
					
				PackDTO mdto= this.convertToDTO(entity);
				
				objDtoList.add(mdto);
			}
			return objDtoList;
		
		
	}



	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#editPack(com.gaConnecte.assistAuto.dto.PackDTO, java.lang.Long)
	 */
	@Override
	public PackDTO editPack(PackDTO pDTO, Long id) {
		pDTO.setId_pack(id);
		Pack p =new Pack();
		p=convertToEntity(pDTO);
		 packRepository.saveAndFlush(p);
		 return pDTO;
	}



	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#deletePack(java.lang.Long)
	 */
	@Override
	public void deletePack(Long id) {
		
		packRepository.delete(id);
		
	}



	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#enableEtatPack(java.lang.Long)
	 */
	@Override
	public void enableEtatPack(Long id) {
		packRepository.enableEtatPack(id);
		
	}



	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#disableEtatPack(java.lang.Long)
	 */
	@Override
	public void disableEtatPack(Long id) {
		packRepository.disableEtatPack(id);
		
	}



	/* (non-Javadoc)
	 * @see com.gaConnecte.assistAuto.service.PackService#listPack()
	 */
	@Override
	public List<Pack> listPack() {
		return packRepository.findAll();
	}




	
	
	
	

}
