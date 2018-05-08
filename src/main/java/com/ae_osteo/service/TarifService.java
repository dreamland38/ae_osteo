package com.ae_osteo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ae_osteo.entity.Tarif;
import com.ae_osteo.repository.TarifRepository;

/**
 * Tarif business service class.
 * @author romai
 *
 */
@Service
public class TarifService {

	@Autowired
	private TarifRepository tarifeRepository;
	
	/**
	 * Retun all tarifs.
	 * @return
	 */
	public List<Tarif> getAllTarifs(){
		
		List<Tarif> tarifs = new ArrayList<>();
		tarifeRepository.findAll()
		.forEach(tarifs::add);
		
		return tarifs;		
	}
}
