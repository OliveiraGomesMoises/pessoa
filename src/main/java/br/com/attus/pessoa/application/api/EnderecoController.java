package br.com.attus.pessoa.application.api;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class EnderecoController implements EnderecoAPI {
	
	@Override
	public EnderecoResponse postEndereco(@Valid EnderecoRequest enderecoRequest) {
		log.info("[inicia] EnderecoController - postEndereco");
		log.info("[finaliza] EnderecoController - postEndereco");
		return null;
	}

	

}
