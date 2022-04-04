package com.eronapps.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import com.eronapps.model.Filme;

public class HTMLGenerator {

	private Writer print;
	
	public HTMLGenerator(PrintWriter print) {
		this.print = print;
	}
	
	public void generator(List<Filme> listaDefilmes) throws IOException {
		
		print.write(inicioDoHTML());
		
		StringBuilder sb = new StringBuilder();
		for (Filme filme : listaDefilmes) {
			sb.append("<!-- Filme "+ filme.getRank() + " -->\n"
					+ "<div class=\"card text-white bg-secondary mx-3 my-2\" style=\"width: 18rem;\">\n"
					+ "	<div class=\"card-header\">" + filme.getTitle() + "</div>\n"
					+ "	<img class=\"img-fluid img-thumbnail\" src=\"" + filme.getImage()+ "\"  class=\"card-img-top\" alt=\"image\">"
					+ "	<div class=\"card-body\">\n"
					+ "		<span>Nota: " + filme.getImDbRating() +"</span>\n"
					+ "	    <span>Ano: "+filme.getYear()+ "</span>\n"
					+ "	</div>\n"
					+ "</div>\n"
					+ "\n"
					+ "\n");
		}

		print.write(sb.toString());
		print.write(fimDoHTML());
		
		print.flush();
	}
	
	private String inicioDoHTML() {
		return "<!doctype html>\n"
				+ "<html lang=\"pt-br\">\n"
				+ "<head>\n"
				+ "<meta charset=\"utf-8\">\n"
				+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
				+ "<title>API IMDB</title>\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "<div class=\"container\">\n"
				+ "<div class=\"d-flex flex-wrap\">\n"
				+ "\n"
				+ "\n";
	}
	
	public String fimDoHTML() {
		return "\n"
				+ "\n"
				+ "<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n"
				+ "  </body>\n"
				+ "</html>";
	}
}
