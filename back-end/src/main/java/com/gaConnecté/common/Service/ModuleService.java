package com.gaConnecté.common.Service;

import java.util.List;

import com.gaConnecté.common.DTO.ModuleDTO;
import com.gaConnecté.common.Entities.Module;

public interface ModuleService extends FwkGenericService<Module, ModuleDTO>{
	
	//public List<ModuleDTO> listModuleByRole(Integer roleId) ;
	public List<ModuleDTO> convertListToDTO(List<Module> m);
	public List<Module> convertListToEntity(List<ModuleDTO> mdto);
	List<ModuleDTO> updateModule (List<ModuleDTO> mdto, Integer id);
	public List<ModuleDTO> listModules() ;
	
}
