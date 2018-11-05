package br.com.bandtec.gamemania.domain;

import javax.persistence.Embeddable;

@Embeddable
public class CPF {

	private String cpf;
	
	protected CPF() {}

	public CPF(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
}
