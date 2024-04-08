package br.com.attus.pessoa.application.service;

import java.util.List;

import br.com.attus.pessoa.application.api.PessoaListResponse;
import br.com.attus.pessoa.application.api.PessoaRequest;
import br.com.attus.pessoa.application.api.PessoaResponse;

public interface PessoaService {
	PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

	List<PessoaListResponse> buscaTodasPessoas();

}
