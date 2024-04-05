package br.com.attus.pessoa.application.service;

import org.springframework.stereotype.Service;

import br.com.attus.pessoa.application.api.PessoaRequest;
import br.com.attus.pessoa.application.api.PessoaResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PessoaApplicationService implements PessoaService {

	@Override
	public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa");
		log.info("[finaliza] PessoaApplicationService - criaPessoa");
		return null;
	}

}