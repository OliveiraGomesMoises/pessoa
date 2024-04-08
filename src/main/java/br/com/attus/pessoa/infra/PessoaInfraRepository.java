package br.com.attus.pessoa.infra;

import org.springframework.stereotype.Repository;

import br.com.attus.pessoa.domain.Pessoa;
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

	private void save(Pessoa pessoa) {
		// TODO Auto-generated method stub

	}

}
