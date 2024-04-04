package br.com.attus.pessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/") 
public class PessoaApplication {
	@GetMapping
	public String getHomeTeste() {
		return "PESSOA - API HOME";
	}
	public static void main(String[] args) {
		SpringApplication.run(PessoaApplication.class, args);
	}

}
