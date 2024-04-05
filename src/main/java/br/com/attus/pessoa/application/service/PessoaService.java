package br.com.attus.pessoa.application.service;

import br.com.attus.pessoa.application.api.PessoaRequest;
import br.com.attus.pessoa.application.api.PessoaResponse;

public interface PessoaService {
	PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

}
