package br.com.bandtec.gamemania.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.bandtec.gamemania.domain.Jogador;

@Repository
public interface TodosJogadores extends JpaRepository<Jogador, UUID>{

	@Query("from Jogador where nome= :nome")
	List<Jogador> deNome(@Param("nome")String nome);

	
}
