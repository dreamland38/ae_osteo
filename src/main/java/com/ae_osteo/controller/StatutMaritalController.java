package com.ae_osteo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ae_osteo.entity.StatutMarital;
import com.ae_osteo.service.StatutMaritalService;

/**
 * Statut marital controller.
 * @author romai
 *
 */
@RestController
public class StatutMaritalController {

	@Autowired
	private StatutMaritalService statutMaritalService;
	
	/**
	 * Return all tarifs.
	 * @return
	 */
	@RequestMapping("/statuts-maritaux")
	public List<StatutMarital> getAllStatutsMaritaux(){
		
		return statutMaritalService.getAllStatutsMaritaux();		
	}
}
