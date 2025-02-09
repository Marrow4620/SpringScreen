package br.com.spring.screenmatch;

import br.com.spring.screenmatch.model.DadosSerie;
import br.com.spring.screenmatch.service.ConsumoApi;
import br.com.spring.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	var consumoApi = new ConsumoApi();
	var json = consumoApi.obterDados("https://www.omdbapi.com/?t=Flash&apikey=990cac7");
	System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
