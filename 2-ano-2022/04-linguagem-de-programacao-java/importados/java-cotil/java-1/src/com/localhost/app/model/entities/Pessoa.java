package com.localhost.app.model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import com.localhost.app.model.entities.exceptions.DataInvalidaException;

/**
 * Representa a entidade Pessoa no sistema
 * @author lucas
 * @version 0.1
 */
public final class Pessoa  implements Serializable{

	private static final long serialVersionUID = 1L;

	private String  nome;
	private Integer idade;
	private LocalDate nascimento;
	
	private final static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Pessoa () {
		nome = "";
		nascimento = LocalDate.MIN;
	}

	public Pessoa(String nome, LocalDate nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	/**
	 * @param nome da pessoa
	 * @param data data como String no formato (dd/MM/yyyy)
	 * @throws DataInvalidaException caso seja data invalida ou no futuro
	 */
	public Pessoa( String nome, String data ) throws DataInvalidaException {
		this.nome = nome;
		calculaIdadeDe(data);
	}

	/**
	 * atribui a idade, o calculo realizado entre a data de nascimento fornecida e o dia atual
	 * @param date_pattern uma string contendo a dada de nascimento no formato (dd/MM/yyyy)
	 * @throws DataInvalidaException caso a data seja no futuro ou invalida
	 */
	public void calculaIdadeDe( String data ) throws DataInvalidaException {
		nascimento = LocalDate.parse(data, dateFormatter);
		LocalDate today = LocalDate.now(); 

		if ( nascimento.isAfter( today ) ) throw new DataInvalidaException("Você é do futuro por acaso ?");
		
		this.idade = Period.between(nascimento, today).getYears();
	}

	/**
	 * Apelido para getIdade()
	 * @return idade
	 */
	public Integer informaIdade() {
		return idade;
	}

	/**
	 * Apelido para getNome()
	 * @return nome
	 */
	public String informaNome() {
		return nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) throws DataInvalidaException {
		if ( nascimento.isAfter(LocalDate.now()) ) throw new DataInvalidaException("Você é do futuro por acaso ?");
		this.nascimento = nascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", nascimento: " + dateFormatter.format(nascimento) + ", Idade: " + idade + " anos";
	}
}
