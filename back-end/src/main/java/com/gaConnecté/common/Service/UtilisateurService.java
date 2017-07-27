package com.gaConnecté.common.Service;

import java.util.List;

import com.gaConnecté.common.DTO.UtilisateurDTO;
import com.gaConnecté.common.Entities.Role;
import com.gaConnecté.common.Entities.Utilisateur;

public interface UtilisateurService {
	
	/**
	 * 
	 * @param utilisateurDTO
	 * @return
	 */
	
	public Utilisateur convertToEntity(UtilisateurDTO utilisateurDTO);
	public void bloquerUtilisateur(Integer id);
	public void débloquerUtilisateur(Integer id);
	public Boolean supprimerUtilisateur(Integer id);
	public boolean verifByMail(String email);
	public UtilisateurDTO load(Utilisateur u);
	public boolean verifByMotDePasse(String motDePasse, String email);
	public boolean logout(Integer id);
	
/**
 * 
 * @param cDTO
 * @return
 */
	
	public UtilisateurDTO addUtilisateur(UtilisateurDTO cDTO) ;
	/**
	 * 
	 * @param utilisateurDTO
	 * @return
	 */
	
	public Utilisateur convertToEntityForEdit(UtilisateurDTO utilisateurDTO);
	/**
	 * 
	 * @param rDTO
	 * @param id
	 * @return
	 */
	
	public UtilisateurDTO updateUtilisateur(UtilisateurDTO rDTO, Integer id);
	/**
	 * 
	 * @param id
	 * @return
	 */
	
	public UtilisateurDTO getUtilisateurById(Integer id);
	/**
	 * 
	 * @return
	 */
	
	public List<Utilisateur> listUtilisateur() ;
	/**
	 * 
	 * @param entity
	 * @return
	 */
	
	public UtilisateurDTO convertToDTO(Utilisateur entity);
	
	/**
	 * 
	 * @param u
	 * @return
	 */
	
	public List<UtilisateurDTO> convertToDTO(List<Utilisateur> u);

}
