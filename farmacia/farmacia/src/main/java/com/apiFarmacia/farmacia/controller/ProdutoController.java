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

import  com.apiFarmacia.farmacia.model.Produto ;
import  com.apiFarmacia.farmacia.repository.ProdutoRepository ;

@RestController
@RequestMapping ( " / produtos " )
@CrossOrigin ( " * " )
public class ProdutoController {
	@Autowired
	  private repository ProdutoRepository ;
	
	@GetMapping
	public  ResponseEntity<Object>  GetAll () {
		return  ResponseEntity . ok (repository.findAll());
	}
	
	@GetMapping ( " / {id} " )
	public  ResponseEntity < Produto >  GetById ( @PathVariable  Long  id, int rest ) {
		return repository.findById(id).map (rest - >  ResponseEntity . ok (post(null)))
				.orElse ( ResponseEntity . notFound () . build ());
	}
	
	@GetMapping ( " / produto / {produto} " )
	public  ResponseEntity  List <Produto>  Object GetByProduto ( @PathVariable  Cordas  PRODUTO ) {
		return  ResponseEntity . ok (repository . findAllByNomeContainingIgnoreCase (PRODUTO));
	}
	
	@PostMapping
	public  ResponseEntity < Produto >  post ( @RequestBody  Produto  produto ) {
		return  ((Object) ResponseEntity . status ( HttpStatus . CREATED )) . corpo (repository . salvar (produto));
	}
	
	@PutMapping
	public  ResponseEntity < Produto >  put ( @RequestBody  Produto  produto ) {
		return  ResponseEntity . status ( HttpStatus . OK ) . corpo (repository . salvar (produto));
	}
	
	@DeleteMapping ( " / {id} " )
	public  void  delete ( @PathVariable  Long  id ) {
		repository . deleteById (id);
	}

}
