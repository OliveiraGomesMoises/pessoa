package br.com.attus.pessoa.application.api;

import java.time.LocalDate;

import br.com.attus.pessoa.domain.Endereco;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class PessoaRequest {
	@NotBlank
	private String nomeCompleto;
	private LocalDate dataDeNascimento;
	private Endereco endereco;

}
