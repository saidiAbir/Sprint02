package com.abir.bijoux.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.abir.bijoux.entities.Bijoux;
import com.abir.bijoux.entities.Marque;

public interface BijouxService {
	  Bijoux saveBijoux(Bijoux b); 
	  Bijoux updateBijoux(Bijoux b); 
	  void deleteBijoux(Bijoux b); 
	  void deleteBijouxById(Long id); 
	  Bijoux getBijoux(Long id); 
	  static List<Bijoux> getAllBijoux() {
		// TODO Auto-generated method stub
		return null;
	} 
	  Page<Bijoux> getAllBijouxParPage(int page, int size);
	  
	  List<Bijoux> findByNomBijoux(String nom); 
	  List<Bijoux> findByNomBijouxContains(String nom); 
	  List<Bijoux> findByNomPrix (String nom, Double prix); 
	  List<Bijoux> findByMarque (Marque marque); 
	  List<Bijoux> findByMarqueIdCat(Long id); 
	  List<Bijoux> findByOrderByNomBijouxAsc(); 
	/*  List<Bijoux> trierBijouxNomsPrix(); */
	  List<Marque> getAllMarque(); 



}
