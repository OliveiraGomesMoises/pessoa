package br.com.attus.pessoa.infra;

import java.util.List;

import br.com.attus.pessoa.domain.Pessoa;

public interface PessoaRepository {

	Pessoa salva(Pessoa pessoa);

	List<Pessoa> buscaToadasPessoas();

}
