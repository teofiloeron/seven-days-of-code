package com.eronapps;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.List;

import com.eronapps.config.Configuracoes;
import com.eronapps.model.Filme;
import com.eronapps.service.Service;
import com.eronapps.util.FilmeUtil;
import com.eronapps.util.HTMLGenerator;

public class Main {
	
	public static void startConfiguracoes() {
		Configuracoes.inicializar();
	}

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		startConfiguracoes();
		
		String apiKey = args[0];
		String uri = Configuracoes.propIMDB.getProperty("uri.top250movies") + apiKey;

		HttpResponse<String> response = new Service().doRequest(uri);
		
		if(response.statusCode() == 200) {
			
			System.out.println("Resposta recebida com sucesso!");
			
//			// Parser feito em JAVA
//			List<Filme> listaDeFilmesPorJava = FilmeUtil.parseFilmes(response.body());
//			listaDeFilmesPorJava.forEach(System.out::println);
			
			// Parser da resposta para Objetos JAVA com Jackson
		    List<Filme> listaDeFilmesPorJackson = FilmeUtil.parseJson(response.body());
		    for (Filme filme : listaDeFilmesPorJackson) {
				System.out.println(filme.toString());
			}
		 
		    System.out.println("Chamando generator...");
		    new HTMLGenerator(new PrintWriter("IMDBtop250movies.html")).generator(listaDeFilmesPorJackson);
		    
		}
		
	}
	
}











