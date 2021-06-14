package com.apiFarmacia.farmacia.controller;

import  java.util.List ;


import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.http.HttpStatus ;
import  org.springframework.http.ResponseEntity ;
import  org.springframework.web.bind.annotation.CrossOrigin ;
import  org.springframework.web.bind.annotation.DeleteMapping ;
import  org.springframework.web.bind.annotation.GetMapping ;
import  org.springframework.web.bind.annotation.PathVariable ;
import  org.springframework.web.bind.annotation.PostMapping ;
import  org.springframework.web.bind.annotation.PutMapping ;
import  org.springframework.web.bind.annotation.RequestBody ;
import  org.springframework.web.bind.annotation.RequestMapping ;
import  org.springframework.web.bind.annotation.RestController ;

import  com.apiFarmacia.farmacia.model.Categoria ;
import  com.apiFarmacia.farmacia.repository.CategoriaRepository ;

@RestController
@CrossOrigin (origins =  " * " , allowedHeaders =  " * " )
@RequestMapping ( " / categoria " )

public class CategoriaController {

	@Autowired
	 private repository CategoriaRepository ;
	
	@GetMapping
	public ResponseEntity<Object>  GetAll () {
		return  ResponseEntity . ok (repository . findAll ());
	}
	
	@GetMapping ( " / {id} " )
	public  ResponseEntity < Categoria >  GetById ( @PathVariable  Long  id ) {
		int rest;
		return repository.findById(id).getClass   >  ResponseEntity.ok(rest)
				.orElse(id)( ResponseEntity . notFound ().build()));
	}
	
	@GetMapping ( " / tipo / {tipo} " )
	public ResponseEntity < List < Categoria > >  GetByTipo ( @PathVariable  Categoria  tipo ) {
		return  ResponseEntity.ok() (repository . findAllByTipoContainingIgnoreCase (tipo));
	}
	
	@PostMapping
	public  ResponseEntity < Categoria >  post ( @RequestBody  Categoria  categoria ) {
		return  ResponseEntity . status ( HttpStatus . CREATED ).body(repository.class));
	}
	
	@PutMapping
	public  ResponseEntity<Object>  put ( @RequestBody  Categoria  categoria ) {
		return  ResponseEntity . ok (repository.findAllByTipoContainingIgnoreCase(categoria));
	}
	
	@DeleteMapping ( " / {id} " )
	public  void  delete ( @PathVariable  Long  id ) {
		repository . deleteById (id);
	}
}
