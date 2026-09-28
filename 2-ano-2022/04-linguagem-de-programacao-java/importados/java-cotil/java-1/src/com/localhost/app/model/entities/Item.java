/**
 * 
 */
package com.localhost.app.model.entities;

import java.io.Serializable;

/**
 * Representa a entidade Item no sistema
 * @author lucas
 * @version 0.1
 */
public final class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String  descricao;
	private Integer quantidade;
	private Double  valor;
	
	public Item () {	
	}

	public Item(Integer codigo, String descricao, Integer quantidade, Double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		setValor( valor );
	}
	
	
	/**
	 * Retorna o total destes itens
	 * @return o valor total ou zero;
	 */
	public Double getTotal () {
		return valor * quantidade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor > 0 ? valor : 0;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + ", Descrição: " + descricao + ", valor unitário: " + valor + ", total de itens: " + quantidade;
	}
}
