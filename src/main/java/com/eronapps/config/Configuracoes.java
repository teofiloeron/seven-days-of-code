package com.eronapps.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

public class Configuracoes {
	
	public static Properties propIMDB = new Properties();
	
	public static void inicializar() {
		try {
			
			propIMDB.load(new FileInputStream("./src/main/resources/config.properties"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
