package br.edu.infnet.peca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.peca.model.Peca;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long>{
	
	

}
