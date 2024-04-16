package br.com.attus.pessoa.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/pessoa/{idpessoa}/endereco")
public interface EnderecoAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	EnderecoResponse postEndereco(@Valid @RequestBody EnderecoRequest enderecoRequest);


}
