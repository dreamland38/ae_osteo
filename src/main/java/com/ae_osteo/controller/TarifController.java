/**
 * 
 */
package com.ae_osteo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ae_osteo.entity.Tarif;
import com.ae_osteo.service.TarifService;

/**
 * Tarif controller
 * @author romai
 *
 */
@RestController
public class TarifController {

	@Autowired
	private TarifService tarifService;
	
	/**
	 * Return all tarifs.
	 * @return
	 */
	@RequestMapping("/tarifs")
	public List<Tarif> getAllTarifs(){
		
		return tarifService.getAllTarifs();		
	}
}
