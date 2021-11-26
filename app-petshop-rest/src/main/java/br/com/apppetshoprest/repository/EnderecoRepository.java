package br.com.apppetshoprest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.apppetshoprest.data.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
/*
	@Query("SELECT r FROM Endereco r WHERE r.rua LIKE LOWER(CONCAT ('%', :rua ,'%'))")
	Page<Endereco> buscarEnderecoPorRua(@Param("rua") String rua, Pageable pageable);
	*/
}
