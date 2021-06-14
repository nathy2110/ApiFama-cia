package com.apiFarmacia.farmacia.repository;
import  java.util.List ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  com.apiFarmacia.farmacia.model.Produto ;
public interface ProdutoRepository extends JpaRepository < Produto , Long > {
	public List < Produto > findAllByNomeContainingIgnoreCase ( String  nome );

}
