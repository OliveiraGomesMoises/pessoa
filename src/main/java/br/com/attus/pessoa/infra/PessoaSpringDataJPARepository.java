package br.com.attus.pessoa.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.attus.pessoa.domain.Pessoa;

public interface PessoaSpringDataJPARepository extends JpaRepository<Pessoa, UUID> {

	Optional<Pessoa> findByIdPessoa(UUID idPessoa);

}
