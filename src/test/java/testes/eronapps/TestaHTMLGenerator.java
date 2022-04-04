package testes.eronapps;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.eronapps.model.Filme;
import com.eronapps.util.HTMLGenerator;

public class TestaHTMLGenerator {

	@Test
	public void testaHTMLGeneratorGenerate() throws IOException {
		
		PrintWriter print = new PrintWriter("IMDBtop250movies.html");
		
		Filme filme = new Filme();
		filme.setTitle("Orgulho e Preconceito");
		filme.setImage("https://br.web.img3.acsta.net/medias/nmedia/18/87/84/14/20028635.jpg");
		filme.setImDbRating("4.6");
		filme.setYear("2006");
		
		List<Filme> lista = Arrays.asList(filme, filme, filme);
		new HTMLGenerator(print).generator(lista);
		
	}

}
