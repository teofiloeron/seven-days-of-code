package com.eronapps;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		HttpRequest httpRequest = HttpRequest
									.newBuilder()
									.uri(new URI("https://imdb-api.com/en/API/Top250Movies/" + args[0]))
									.build();
		
		HttpClient client = HttpClient.newBuilder().build();
		
		HttpResponse<String> response = client.send(httpRequest, BodyHandlers.ofString());
		
		System.out.println(response.body());
		
	}

}











