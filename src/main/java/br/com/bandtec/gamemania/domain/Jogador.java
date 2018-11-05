package br.com.bandtec.gamemania.domain;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jogadores")
public class Jogador {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	private String nome;
	
	@Embedded
	private CPF cpf;
	
	private String apelido;
		
	protected Jogador() {}

	public Jogador(String nome, CPF cpf, String apelido) {
		this.nome = nome;
		this.cpf = cpf;
		this.apelido = apelido;
	}

	public UUID getId() {
		return this.id;
	}
}
