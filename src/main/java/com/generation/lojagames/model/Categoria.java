package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	@NotBlank(message= "O atributo é de preenchimento obrigatório e não pode ser deixado em branco")
	@Size(min=5 , max=40, message = "O atributo aceita no minimo 5 e no máximo 40 caracteres")
	private String genero;
	 
	 
     @NotNull(message= "O atributo é de preenchimento obrigatório e não pode ser deixado em branco")
	 private int quantidade;
	 
	
	 @OneToMany(mappedBy = "Categoria", cascade = CascadeType.REMOVE )
	 @JsonIgnoreProperties("Categoria")
	 private List<Produto> produto;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}


	

	}
	
	 
	
