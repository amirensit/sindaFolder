package com.gaConnecte.assistAuto.dto;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class ContratDTO.
 */
public class ContratDTO {

	
	/** The id contrat. */
	private Long id_contrat;
	
	/** The num contrat. */
	private Long num_contrat;
	
	/** The nom. */
	private String nom;
	
	/** The prenom. */
	private String prenom;
	
	/** The addresse. */
	private String addresse;
	
	/** The date debut. */
	private Date date_debut;
	
	/** The date fin. */
	private Date date_fin;
	
	/** The pack DTO. */
	private PackDTO packDTO;
	
	/** The marque DTO. */
	private MarqueDTO marqueDTO;
	
	/** The ville DTO. */
	private VilleDTO villeDTO;
	
	
	
	
	
	/**
	 * Gets the ville DTO.
	 *
	 * @return the ville DTO
	 */
	public VilleDTO getVilleDTO() {
		return villeDTO;
	}
	
	/**
	 * Sets the ville DTO.
	 *
	 * @param villeDTO the new ville DTO
	 */
	public void setVilleDTO(VilleDTO villeDTO) {
		this.villeDTO = villeDTO;
	}
	
	/**
	 * Gets the id contrat.
	 *
	 * @return the id contrat
	 */
	public Long getId_contrat() {
		return id_contrat;
	}
	
	/**
	 * Sets the id contrat.
	 *
	 * @param id_contrat the new id contrat
	 */
	public void setId_contrat(Long id_contrat) {
		this.id_contrat = id_contrat;
	}

	/**
	 * Gets the marque DTO.
	 *
	 * @return the marque DTO
	 */
	public MarqueDTO getMarqueDTO() {
		return marqueDTO;
	}
	
	/**
	 * Sets the marque DTO.
	 *
	 * @param marqueDTO the new marque DTO
	 */
	public void setMarqueDTO(MarqueDTO marqueDTO) {
		this.marqueDTO = marqueDTO;
	}
	
	/**
	 * Gets the pack DTO.
	 *
	 * @return the pack DTO
	 */
	public PackDTO getPackDTO() {
		return packDTO;
	}
	
	/**
	 * Sets the pack DTO.
	 *
	 * @param packDTO the new pack DTO
	 */
	public void setPackDTO(PackDTO packDTO) {
		this.packDTO = packDTO;
	}
	
	/**
	 * Gets the num contrat.
	 *
	 * @return the num contrat
	 */
	public Long getNum_contrat() {
		return num_contrat;
	}
	
	/**
	 * Sets the num contrat.
	 *
	 * @param num_contrat the new num contrat
	 */
	public void setNum_contrat(Long num_contrat) {
		this.num_contrat = num_contrat;
	}
	
	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Gets the addresse.
	 *
	 * @return the addresse
	 */
	public String getAddresse() {
		return addresse;
	}
	
	/**
	 * Sets the addresse.
	 *
	 * @param addresse the new addresse
	 */
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	
	/**
	 * Gets the date debut.
	 *
	 * @return the date debut
	 */
	public Date getDate_debut() {
		return date_debut;
	}
	
	/**
	 * Sets the date debut.
	 *
	 * @param date_debut the new date debut
	 */
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	
	/**
	 * Gets the date fin.
	 *
	 * @return the date fin
	 */
	public Date getDate_fin() {
		return date_fin;
	}
	
	/**
	 * Sets the date fin.
	 *
	 * @param date_fin the new date fin
	 */
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
	
	
}
