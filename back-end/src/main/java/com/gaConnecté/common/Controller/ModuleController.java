package com.gaConnecté.common.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaConnecté.common.DTO.ModuleDTO;
import com.gaConnecté.common.DTO.RoleDTO;
import com.gaConnecté.common.Entities.Module;
import com.gaConnecté.common.Entities.Role;
import com.gaConnecté.common.Service.ModuleService;
import com.gaConnecté.common.Service.UtilisateurService;


@RestController
@RequestMapping(value = "modules")
@CrossOrigin(origins = "http://localhost:3000")
public class ModuleController {

	
	@Autowired
	private ModuleService moduleService;
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping( method = RequestMethod.GET)
	public List<ModuleDTO> listModule() {
		List<ModuleDTO> r=moduleService.listModules();
		
		return r;
		
	}

}
