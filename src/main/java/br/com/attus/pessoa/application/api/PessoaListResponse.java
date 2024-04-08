package br.com.attus.pessoa.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.attus.pessoa.domain.Pessoa;

public class PessoaListResponse {
	private UUID idPessoa;
	private String nomeCompleto;
	private LocalDate dataDeNascimento;
	
	public static List<PessoaListResponse> convert(List<Pessoa> pessoas) {
		// TODO Auto-generated method stub
		return null;
	}

}
