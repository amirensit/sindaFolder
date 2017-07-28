package com.gaConnecte.assistAuto.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



// TODO: Auto-generated Javadoc
/**
 * The Class Contrat.
 */
@Entity
public class Contrat implements Serializable {
	
	/** The id contrat. */
	@Id
	@GeneratedValue
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
	
	/** The marque. */
	@ManyToOne
	@JoinColumn(name="CODE_MARQUE")
	private Marque marque;
	
	/** The pack. */
	@ManyToOne
	@JoinColumn(name="CODE_Pack")
	private Pack pack;
	
	/** The ville. */
	@ManyToOne
	@JoinColumn(name="CODE_VILLE")
	private Ville ville;

	/**
	 * Instantiates a new contrat.
	 */
	public Contrat() {
		super();
	}

	/**
	 * Instantiates a new contrat.
	 *
	 * @param id_contrat the id contrat
	 * @param num_contrat the num contrat
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param addresse the addresse
	 * @param date_debut the date debut
	 * @param date_fin the date fin
	 * @param marque the marque
	 * @param pack the pack
	 */
	public Contrat(Long id_contrat, Long num_contrat, String nom, String prenom, String addresse, Date date_debut,
			Date date_fin, Marque marque, Pack pack) {
		super();
		this.id_contrat = id_contrat;
		this.num_contrat = num_contrat;
		this.nom = nom;
		this.prenom = prenom;
		this.addresse = addresse;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.marque = marque;
		this.pack = pack;
	}

	/**
	 * Instantiates a new contrat.
	 *
	 * @param num_contrat the num contrat
	 * @param nom the nom
	 * @param prenom the prenom
	 * @param addresse the addresse
	 * @param date_debut the date debut
	 * @param date_fin the date fin
	 */
	public Contrat(Long num_contrat, String nom, String prenom, String addresse, Date date_debut, Date date_fin) {
		super();
		this.num_contrat = num_contrat;
		this.nom = nom;
		this.prenom = prenom;
		this.addresse = addresse;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
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

	/**
	 * Gets the marque.
	 *
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}

	/**
	 * Sets the marque.
	 *
	 * @param marque the new marque
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	/**
	 * Gets the pack.
	 *
	 * @return the pack
	 */
	public Pack getPack() {
		return pack;
	}

	/**
	 * Sets the pack.
	 *
	 * @param pack the new pack
	 */
	public void setPack(Pack pack) {
		this.pack = pack;
	}

	/**
	 * Gets the ville.
	 *
	 * @return the ville
	 */
	public Ville getVille() {
		return ville;
	}

	/**
	 * Sets the ville.
	 *
	 * @param ville the new ville
	 */
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
	
	




	
	
	

}
