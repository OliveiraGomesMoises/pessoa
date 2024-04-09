package br.com.attus.pessoa.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.attus.pessoa.application.api.PessoaDetalhadoResponse;
import br.com.attus.pessoa.application.api.PessoaListResponse;
import br.com.attus.pessoa.application.api.PessoaRequest;
import br.com.attus.pessoa.application.api.PessoaResponse;
import br.com.attus.pessoa.domain.Pessoa;
import br.com.attus.pessoa.infra.PessoaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {

	private final PessoaRepository pessoaRepository;

	@Override
	public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa");
		Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
		log.info("[finaliza] PessoaApplicationService - criaPessoa");
		return PessoaResponse.builder().idPessoa(pessoa.getIdPessoa()).build();
	}

	@Override
	public List<PessoaListResponse> buscaTodasPessoas() {
		log.info("[inicia] PessoaApplicationService - buscaTodasPessoas");
		List<Pessoa> pessoas = pessoaRepository.buscaToadasPessoas();
		log.info("[finaliza] PessoaApplicationService - buscaTodasPessoas");
		return PessoaListResponse.convert(pessoas);
	}

	@Override
	public PessoaDetalhadoResponse buscaPessoaAtravesDoId(UUID idPessoa) {
		log.info("[inicia] PessoaApplicationService - buscaPessoaAtravesDoId");
		Pessoa pessoa = pessoaRepository.buscaPessoaAtravesDoId(idPessoa);
		log.info("[finaliza] PessoaApplicationService - buscaPessoaAtravesDoId");
		return new PessoaDetalhadoResponse(pessoa);
	}

}
