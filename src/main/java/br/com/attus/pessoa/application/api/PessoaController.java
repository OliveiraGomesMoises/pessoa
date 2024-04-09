package br.com.attus.pessoa.application.api;

import java.util.List;
import java.util.UUID;

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
		List<PessoaListResponse> pessoas = pessoaService.buscaTodasPessoas();
		log.info("[finaliza] PessoaController - getTodasPessoas");
		return pessoas;
	}

	@Override
	public PessoaDetalhadoResponse getPessoasAtravesId(UUID idPessoa) {
		log.info("[inicia] PessoaController - getPessoasAtravesId");
		log.info("[idPessoa]{}",idPessoa);
		log.info("[inicia] PessoaController - getPessoasAtravesId");
		return null;
	}

	

}
