package com.eronapps.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Service {

	public HttpResponse<String> doRequest(String uri){
		
		HttpClient client = null;
		HttpResponse<String> response = null;
		
		try {
			HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI(uri)).build();
			client = HttpClient.newHttpClient();
			response = client.send(httpRequest, BodyHandlers.ofString());
		} catch (IOException | InterruptedException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		return response;
	}
	
}
