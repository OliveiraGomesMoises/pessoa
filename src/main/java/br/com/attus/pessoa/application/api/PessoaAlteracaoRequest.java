package br.com.attus.pessoa.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.lang.NonNull;

import br.com.attus.pessoa.domain.Endereco;
import jakarta.validation.constraints.NotBlank;

public class PessoaAlteracaoRequest {
	private UUID idPessoa;
	private String nomeCompleto;
	@NonNull
	private LocalDate dataDeNascimento;
	private Endereco endereco;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

}
