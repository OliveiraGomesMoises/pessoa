package br.com.attus.pessoa.domain;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Embeddable
@RequestMapping
public class Endereco {
	
	private UUID Endereco;
	@NotBlank
	private String logradouro;
	@NotNull
	private Integer cep;
	@NotNull
	private Integer numero;
	@NotBlank
	private String cidade;
	
	public Endereco(UUID endereco, @NotBlank String logradouro, @NotNull Integer cep, @NotNull Integer numero,
			@NotBlank String cidade) {
		super();
		Endereco = endereco;
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.cidade = cidade;
	}

	public UUID getEndereco() {
		return Endereco;
	}

	public void setEndereco(UUID endereco) {
		Endereco = endereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
}
