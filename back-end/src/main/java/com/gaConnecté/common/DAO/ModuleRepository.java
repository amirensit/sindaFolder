package com.gaConnecté.common.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaConnecté.common.Entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Integer> {
	
//	@Query("SELECT m  from  Module m , Role r, module_role mr where r.id= :roleId and m.id=mr.ModuleId and r.id=mr.RoleId")
//	List<Module> findByRole(@Param(value = "roleId") Integer roleId);

}
