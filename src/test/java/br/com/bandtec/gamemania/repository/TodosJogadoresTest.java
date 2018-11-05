package br.com.bandtec.gamemania.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.transaction.Transactional;

import org.junit.Test;
import java.util.List;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.bandtec.gamemania.domain.CPF;
import br.com.bandtec.gamemania.domain.Jogador;

@Transactional
@Commit
@SpringBootTest
@RunWith(SpringRunner.class)
public class TodosJogadoresTest {

	@Autowired
	private TodosJogadores todosJogadores;
	
	private Jogador ronaldinho = new Jogador("ronaldinho", new CPF("111.111.111-11"), "bruxo");
	
	@Test
	public void inserirNovoJogador() {
		todosJogadores.save(ronaldinho);
		
		Jogador jogadorEncontrado = todosJogadores.getOne(ronaldinho.getId());
		assertEquals(ronaldinho, jogadorEncontrado);
	}
	
	@Test
	public void buscarJogador() {
		todosJogadores.save(ronaldinho);
		
		List<Jogador> jogadores = todosJogadores.deNome("ronaldo");
		
		assertTrue(jogadores.contains(ronaldinho));
	}
}
