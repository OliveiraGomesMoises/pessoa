package br.com.attus.pessoa.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.attus.pessoa.domain.Endereco;
import lombok.Value;
@Value
public class PessoaDetalhadoResponse {
	private UUID idPessoa;
	private String nomeCompleto;
	private LocalDate dataDeNascimento;
	private Endereco endereco;
	private LocalDateTime dataHoraDoCadastro;

}
