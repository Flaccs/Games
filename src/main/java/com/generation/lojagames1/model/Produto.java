package com.generation.lojagames1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotBlank(message = "O jogo é um campo obrigatório")
	@Size(min = 2, max = 100, message = "O campo jogo deve conter entre 2 e 100 caracteres")
	private String jogo;
	
	@NotBlank(message = "O camiseta é um campo obrigatório")
	@Size(min = 2, max = 100, message = "O camiseta nome deve conter entre 2 e 100 caracteres")
	private String camiseta;
	
	@NotBlank(message = "O caneca é um campo obrigatório")
	@Size(min = 2, max = 100, message = "O campo caneca deve conter entre 2 e 100 caracteres")
	private String caneca;
	
	@NotBlank(message = "O chaveiro é um campo obrigatório")
	@Size(min = 2, max = 100, message = "O campo chaveiro deve conter entre 2 e 100 caracteres")
	private String chaveiro;
	
	@NotBlank(message = "O funko é um campo obrigatório")
	@Size(min = 2, max = 100, message = "O campo funko deve conter entre 2 e 100 caracteres")
	private String funko;
	
	@NotBlank(message = "O livro é um campo obrigatório")
	@Size(min = 2, max = 100, message = "O campo livro deve conter entre 2 e 100 caracteres")
	private String livro;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public String getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(String camiseta) {
		this.camiseta = camiseta;
	}

	public String getCaneca() {
		return caneca;
	}

	public void setCaneca(String caneca) {
		this.caneca = caneca;
	}

	public String getChaveiro() {
		return chaveiro;
	}

	public void setChaveiro(String chaveiro) {
		this.chaveiro = chaveiro;
	}

	public String getFunko() {
		return funko;
	}

	public void setFunko(String funko) {
		this.funko = funko;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
