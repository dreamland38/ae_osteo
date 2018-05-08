package com.ae_osteo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ae_osteo.entity.StatutMarital;
import com.ae_osteo.repository.StatutMaritalRepository;

/**
 * Statut marital business service class.
 * @author romai
 *
 */
@Service
public class StatutMaritalService {

	@Autowired
	private StatutMaritalRepository statutMaritalRepository;
	
	/**
	 * Retun all statut marital.
	 * @return
	 */
	public List<StatutMarital> getAllStatutsMaritaux(){
		
		List<StatutMarital> statutsMaritaux = new ArrayList<>();
		statutMaritalRepository.findAll()
		.forEach(statutsMaritaux::add);
		
		return statutsMaritaux;		
	}
}
