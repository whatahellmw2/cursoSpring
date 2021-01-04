package com.curso.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.cursoSpring.domain.Categoria;

@Repository
public interface CategoriaRepositorie extends JpaRepository<Categoria, Integer>  {

}
