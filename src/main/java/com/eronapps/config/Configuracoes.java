package com.eronapps.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import com.eronapps.util.Log;

public class Configuracoes {
	
	public static Properties propIMDB = new Properties();
	
	public static void inicializar() {
		try {
			
			Log.get().info("Carregando arquivo properties");
			propIMDB.load(new FileInputStream("./src/main/resources/config.properties"));
			
			Collection<Object> values = propIMDB.values();
			for (Iterator<Object> iterator = values.iterator(); iterator.hasNext();) {
				Object object = (Object) iterator.next();
				Log.get().info(object.toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
