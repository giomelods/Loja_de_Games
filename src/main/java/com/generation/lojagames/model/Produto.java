package com.generation.lojagames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
@NotBlank(message= "O atributo é de preenchimento obrigatório e não pode ser deixado em branco")
@Size(min=5 , max=40, message = "O atributo aceita no minimo 5 e no máximo 40 caracteres")
private String nome;
 

@NotNull(message= "O atributo é de preenchimento obrigatório e não pode ser deixado em branco")
@Digits(integer=3,fraction=2,message="Apenas centenas e 2 casas após o ponto.")
private BigDecimal preco;
 
@NotBlank(message= "O atributo é de preenchimento obrigatório e não pode ser deixado em branco")
@Size(min=5 , max=40, message = "O atributo aceita no minimo 5 e no máximo 40 caracteres")
private String descricao;
 
@NotBlank(message= "O atributo é de preenchimento obrigatório e não pode ser deixado em branco")
@Size(min=5 , max=40, message = "O atributo aceita no minimo 5 e no máximo 40 caracteres")
 private String plataforma;
 
@NotNull(message= "O atributo é de preenchimento obrigatório e não pode ser deixado em branco")
 private int quantidade;
 
 @NotBlank(message= "O atributo é de preenchimento obrigatório e não pode ser deixado em branco")
 @Size(min=5 , max=40, message = "O atributo aceita no minimo 5 e no máximo 40 caracteres")
 private String foto;

 @ManyToOne
 @JsonIgnoreProperties("Produto")
 private Categoria categoria ;
 
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public BigDecimal getPreco() {
	return preco;
}

public void setPreco(BigDecimal preco) {
	this.preco = preco;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getPlataforma() {
	return plataforma;
}

public void setPlataforma(String plataforma) {
	this.plataforma = plataforma;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public String getFoto() {
	return foto;
}

public void setFoto(String foto) {
	this.foto = foto;
}

public Produto getCategoria() {
	// TODO Auto-generated method stub
	return null;
}
 
 
 
}
