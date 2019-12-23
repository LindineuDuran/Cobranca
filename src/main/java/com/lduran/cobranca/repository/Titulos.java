package com.lduran.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lduran.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>
{

}
