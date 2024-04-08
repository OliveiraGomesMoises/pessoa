package br.com.attus.pessoa.infra;

import br.com.attus.pessoa.domain.Pessoa;

public interface PessoaRepository {

	Pessoa salva(Pessoa pessoa);

}
