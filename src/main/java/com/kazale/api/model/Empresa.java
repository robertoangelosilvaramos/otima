package com.kazale.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class Empresa {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "cnpj_empresa", nullable = false)
	private String cnpj;
	@Column(name = "tipo_empresa", nullable = false)
	private String tipo;
	@Column(name = "nome_empresa", nullable = false)
	private String nome;
	@Column(name = "razacao_social", nullable = false)
	private String razaoSocial;
	@Column(name = "contato_empresa", nullable = false)
	private String contato;
	@Column(name = "email_empresa", nullable = false)
	private String email;
	@Column(name = "cep_empresa", nullable = false)
	private String cep;
	@Column(name = "estado_empresa", nullable = false)
	private String estado;
	@Column(name = "bairro_empresa", nullable = false)
	private String bairro;
	@Column(name = "cidade_empresa", nullable = false)
	private String cidade;
	@Column(name = "lougradouro_empresa", nullable = false)
	private String logradouro;
	@Column(name = "complemento_empresa", nullable = true)
	private String complemento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
