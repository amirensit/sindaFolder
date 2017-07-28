package com.gaConnecte.assistAuto.daos;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gaConnecte.assistAuto.entities.Marque;

// TODO: Auto-generated Javadoc
/**
 * The Interface MarqueRepository.
 */
public interface MarqueRepository extends JpaRepository<Marque,Long>  {

	/**
	 * Chercher marques.
	 *
	 * @param mc the mc
	 * @param pageable the pageable
	 * @return the page
	 */
	@Query("select p from Marque p where p.nom_marque like :x")
	public Page<Marque> chercherMarques(@Param("x") String mc,Pageable pageable);
	
	
	
	
	
}
