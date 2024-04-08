package br.com.attus.pessoa.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.attus.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PessoaController implements PessoaAPI {
	private final PessoaService pessoaService;

	@Override
	public PessoaResponse postPessoa(PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaController - postPessoa");
		PessoaResponse pessoaCriado = pessoaService.criaPessoa(pessoaRequest);
		log.info("[finaliza] PessoaController - postPessoa");
		return pessoaCriado;
	}

	@Override
	public List<PessoaListResponse> getTodasPessoas() {
		log.info("[inicia] PessoaController - getTodasPessoas");
		log.info("[finaliza] PessoaController - getTodasPessoas");
		return null;
	}

}
