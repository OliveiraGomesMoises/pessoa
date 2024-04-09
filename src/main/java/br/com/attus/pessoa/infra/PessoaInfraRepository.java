package br.com.attus.pessoa.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.attus.pessoa.domain.Pessoa;
import br.com.attus.pessoa.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PessoaInfraRepository implements PessoaRepository {

	private final PessoaSpringDataJPARepository pessoaSpringDataJPARepository;

	@Override
	public Pessoa salva(Pessoa pessoa) {
		log.info("[inicia]PessoaInfraRepository - salva");
		pessoaSpringDataJPARepository.save(pessoa);
		log.info("[finaliza]PessoaInfraRepository - salva");
		return pessoa;
	}

	@Override
	public List<Pessoa> buscaToadasPessoas() {
		log.info("[inicia]PessoaInfraRepository - buscaToadasPessoas");
		List<Pessoa> todaspessoas = pessoaSpringDataJPARepository.findAll();
		log.info("[finaliza]PessoaInfraRepository - buscaToadasPessoas");
		return todaspessoas;
	}

	@Override
	public Pessoa buscaPessoaAtravesDoId(UUID idPessoa) {
		log.info("[inicia]PessoaInfraRepository - buscaPessoaAtravesDoId");
		Pessoa pessoa = pessoaSpringDataJPARepository.findByIdPessoa(idPessoa)
				.orElseThrow(()-> APIException.build(HttpStatus.NOT_FOUND, "Pessoa não Encontrada!"));
		log.info("[finaliza]PessoaInfraRepository - buscaPessoaAtravesDoId");
		return pessoa;
	}

}
