package br.com.attus.pessoa.application.api;

import lombok.Value;

@Value
public class EnderecoRequest {
	private String logradouro;
	private Integer cep;
	private Integer numero;
	private String cidade;

}
