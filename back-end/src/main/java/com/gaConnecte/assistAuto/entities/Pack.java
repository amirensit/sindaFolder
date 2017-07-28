package com.gaConnecte.assistAuto.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;


// TODO: Auto-generated Javadoc
/**
 * The Class Pack.
 */
@Entity
public class Pack implements Serializable {
	
	/** The id pack. */
	@Id
	@GeneratedValue
	private Long id_pack;
	
	
	//@NotNull
	//@Pattern(regexp="^[A-Za-z]+$")
	/** The nom pack. */
	//@Size(max = 60)
	private String nom_pack;
	
	/** The description. */
	//@Size(max = 2000)
	private String description;
	//@Min(0)
	/** The nbre max service. */
	//@Max(99)
	private int nbre_max_service;
	//@Min(0)
	/** The kilometrage max. */
	//@Max(9999)
	private int kilometrage_max;
	
	/** The etat. */
	private Boolean etat;
	
	/** The contrats. */
	@OneToMany(mappedBy="pack",fetch=FetchType.LAZY)
	private List<Contrat> contrats ;
	
	
	
	
	/**
	 * Gets the contrats.
	 *
	 * @return the contrats
	 */
	public List<Contrat> getContrats() {
		return contrats;
	}

	/**
	 * Sets the contrats.
	 *
	 * @param contrats the new contrats
	 */
	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}

	/**
	 * Gets the etat.
	 *
	 * @return the etat
	 */
	public Boolean getEtat() {
		return etat;
	}

	/**
	 * Sets the etat.
	 *
	 * @param etat the new etat
	 */
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	/**
	 * Instantiates a new pack.
	 *
	 * @param nom_pack the nom pack
	 * @param description the description
	 * @param nbre_max_service the nbre max service
	 * @param kilometrage_max the kilometrage max
	 */
	public Pack(String nom_pack, String description, int nbre_max_service, int kilometrage_max) {
		super();
		this.nom_pack = nom_pack;
		this.description = description;
		this.nbre_max_service = nbre_max_service;
		this.kilometrage_max = kilometrage_max;
		this.etat=true;
	}

	
	
	/** The clients. */
	@ManyToMany(mappedBy="packs",cascade=CascadeType.REMOVE)
	private List<Client>clients;

	/**
	 * Instantiates a new pack.
	 */
	public Pack() {
		super();
		this.etat=true;
	}

	/**
	 * Instantiates a new pack.
	 *
	 * @param nom_pack the nom pack
	 * @param description the description
	 * @param nbre_max_service the nbre max service
	 * @param kilometrage_max the kilometrage max
	 * @param clients the clients
	 */
	public Pack(String nom_pack, String description, int nbre_max_service, int kilometrage_max, List<Client> clients) {
		super();
		this.nom_pack = nom_pack;
		this.description = description;
		this.nbre_max_service = nbre_max_service;
		this.kilometrage_max = kilometrage_max;
		this.clients = clients;
		this.etat=true;
	}

	/**
	 * Gets the id pack.
	 *
	 * @return the id pack
	 */
	public Long getId_pack() {
		return id_pack;
	}

	/**
	 * Sets the id pack.
	 *
	 * @param id_pack the new id pack
	 */
	public void setId_pack(Long id_pack) {
		this.id_pack = id_pack;
	}

	/**
	 * Gets the nom pack.
	 *
	 * @return the nom pack
	 */
	public String getNom_pack() {
		return nom_pack;
	}

	/**
	 * Sets the nom pack.
	 *
	 * @param nom_pack the new nom pack
	 */
	public void setNom_pack(String nom_pack) {
		this.nom_pack = nom_pack;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the nbre max service.
	 *
	 * @return the nbre max service
	 */
	public int getNbre_max_service() {
		return nbre_max_service;
	}

	/**
	 * Sets the nbre max service.
	 *
	 * @param nbre_max_service the new nbre max service
	 */
	public void setNbre_max_service(int nbre_max_service) {
		this.nbre_max_service = nbre_max_service;
	}

	/**
	 * Gets the kilometrage max.
	 *
	 * @return the kilometrage max
	 */
	public int getKilometrage_max() {
		return kilometrage_max;
	}

	/**
	 * Sets the kilometrage max.
	 *
	 * @param kilometrage_max the new kilometrage max
	 */
	public void setKilometrage_max(int kilometrage_max) {
		this.kilometrage_max = kilometrage_max;
	}

	/**
	 * Gets the clients.
	 *
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * Sets the clients.
	 *
	 * @param clients the new clients
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
	

}