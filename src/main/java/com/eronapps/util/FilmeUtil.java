package com.eronapps.util;

import java.util.ArrayList;
import java.util.List;

import com.eronapps.model.Filme;
import com.eronapps.model.Items;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilmeUtil {
	
	private static final String SEPARADOR_DEFAULT = "\":\"";
	
	private static String[] separaAtributoValor(String linha) {
		return linha.split(SEPARADOR_DEFAULT);
	}
	
	private static Filme parseFilme(String[] atributosEValores) {

		Filme filme = new Filme();
		
		for (int i = 0; i < atributosEValores.length; i++) {
			
			String linha = atributosEValores[i].trim();
			
			String[] arrayAtributoEValor = separaAtributoValor(linha);
			
			String att = arrayAtributoEValor[0].trim().replaceAll("\"", "");
			switch (att) {
				case "id":
					filme.setId(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				case "rank":
					filme.setRank(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				case "title":
					filme.setTitle(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				case "fullTitle":
					filme.setFullTitle(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				case "year":
					filme.setYear(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				case "image":
					filme.setImage(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				case "crew":
					filme.setCrew(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				case "imDbRating":
					filme.setImDbRating(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				case "imDbRatingCount":
					filme.setImDbRatingCount(arrayAtributoEValor[1].trim().replaceAll("\"", ""));
					break;
				
			default:
				break;
			}
		}
		
		return filme;
	}
	
	public static List<Filme> parseFilmes(String body){
		
		// retira os colchetes []
		String[] split = body.split("\\[|\\]");
		// obtem os itens separados por chaves {}
		String[] itens = split[1].replaceAll("}", "").replaceAll("\t|\n", "").split("\\{"); 
		
		List<String> listaEmStringDeFilmes = new ArrayList<String>(itens.length);
		for (int i = 1; i < itens.length; i++) {
			listaEmStringDeFilmes.add(itens[i].strip());
		}

		List<Filme> listaDeFilmes = new ArrayList<Filme>(listaEmStringDeFilmes.size());
		for (int i = 0; i < listaEmStringDeFilmes.size(); i++) {
			String[] atributosEValores = listaEmStringDeFilmes.get(i).split("\",");
			listaDeFilmes.add(parseFilme(atributosEValores));
		}

		return listaDeFilmes;
	}

	public static List<Filme> parseJson(String json) throws JsonMappingException, JsonProcessingException{
		ObjectMapper objectMapper = new ObjectMapper();
		Items items = objectMapper.readValue(json, Items.class);
		return items.getItems();
	}
}










