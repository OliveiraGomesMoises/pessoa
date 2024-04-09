package br.com.attus.pessoa.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.attus.pessoa.domain.Endereco;
import br.com.attus.pessoa.domain.Pessoa;
import lombok.Value;
@Value
public class PessoaDetalhadoResponse {
	private UUID idPessoa;
	private String nomeCompleto;
	private LocalDate dataDeNascimento;
	private Endereco endereco;
	private LocalDateTime dataHoraDoCadastro;

	public PessoaDetalhadoResponse(Pessoa pessoa) {
		this.idPessoa = pessoa.getIdPessoa();
		this.nomeCompleto = pessoa.getNomeCompleto();
		this.dataDeNascimento = pessoa.getDataDeNascimento();
		this.endereco = pessoa.getEndereco();
		this.dataHoraDoCadastro = pessoa.getDataHoraDoCadastro();
	}

	
	
}
